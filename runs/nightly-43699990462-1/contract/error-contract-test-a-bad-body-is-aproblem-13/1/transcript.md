# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[13]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-3bf73462-8621-4a94-ba31-6e5f798d08c7` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-293f413a-9a84-4a59-8315-f8f182ee92f3` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-3d4fdaca-63fb-49b0-a5e0-3cec944d7d34` |
| 4 | `POST /v1/conversations` | 201 | 49 | `qa-15824ef0-3c16-44b3-94ab-39db13c5a4d1` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 8 | `qa-b969060a-f3fa-469c-b7c3-d9d003335582` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-29336776-d99f-4c00-8ea8-90c071993863` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-a2173485-6f89-4e2f-95ca-a85166d044ef` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-06c0cbf9-bfad-4a47-b89a-d5c9de731ee7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-270ce3ed-55c9-4600-bc6e-0c4520101020` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-215d56fa-5dba-4cb8-a762-fd6ae0c450bf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3bf73462-8621-4a94-ba31-6e5f798d08c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bf73462-8621-4a94-ba31-6e5f798d08c7
Content-Type: application/json

--- request body ---
{"handle":"qa-c14ae254ece1","displayName":"QA c14ae254ece1","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-3bf73462-8621-4a94-ba31-6e5f798d08c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 7
Location: /v1/accounts/qa-c14ae254ece1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c979bd2e-3de0-4c37-a22e-b576c1de73ed","handle":"qa-c14ae254ece1","displayName":"QA c14ae254ece1","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.285037317Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-293f413a-9a84-4a59-8315-f8f182ee92f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-293f413a-9a84-4a59-8315-f8f182ee92f3
Content-Type: application/json

--- request body ---
{"handle":"qa-5df73c15448a","displayName":"QA 5df73c15448a","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-293f413a-9a84-4a59-8315-f8f182ee92f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 7
Location: /v1/accounts/qa-5df73c15448a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2bd1f398-a8fe-4819-8786-e42dd4f34f00","handle":"qa-5df73c15448a","displayName":"QA 5df73c15448a","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.324029184Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3d4fdaca-63fb-49b0-a5e0-3cec944d7d34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d4fdaca-63fb-49b0-a5e0-3cec944d7d34
Content-Type: application/json

--- request body ---
{"handle":"qa-c14ae254ece1","password":"****"}

--- response: 200 in 38 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d4fdaca-63fb-49b0-a5e0-3cec944d7d34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c979bd2e-3de0-4c37-a22e-b576c1de73ed"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-15824ef0-3c16-44b3-94ab-39db13c5a4d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15824ef0-3c16-44b3-94ab-39db13c5a4d1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5df73c15448a","subject":"Error contract","message":"Hi"}

--- response: 201 in 49 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-15824ef0-3c16-44b3-94ab-39db13c5a4d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_4dbc9ead-ecd8-451a-9fc2-b089fcb23c54
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4dbc9ead-ecd8-451a-9fc2-b089fcb23c54","subject":"Error contract","status":"open","region":"eu","participants":["qa-c14ae254ece1","qa-5df73c15448a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:10.438496963Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_4dbc9ead-ecd8-451a-9fc2-b089fcb23c54/messages
correlation: qa-b969060a-f3fa-469c-b7c3-d9d003335582

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b969060a-f3fa-469c-b7c3-d9d003335582
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b969060a-f3fa-469c-b7c3-d9d003335582
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 307

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_4dbc9ead-ecd8-451a-9fc2-b089fcb23c54/messages","correlationId":"qa-b969060a-f3fa-469c-b7c3-d9d003335582"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-29336776-d99f-4c00-8ea8-90c071993863

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29336776-d99f-4c00-8ea8-90c071993863
Content-Type: application/json

--- request body ---
{"handle":"qa-5df73c15448a","password":"****"}

--- response: 200 in 23 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-29336776-d99f-4c00-8ea8-90c071993863
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2bd1f398-a8fe-4819-8786-e42dd4f34f00"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a2173485-6f89-4e2f-95ca-a85166d044ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2173485-6f89-4e2f-95ca-a85166d044ef
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a2173485-6f89-4e2f-95ca-a85166d044ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-06c0cbf9-bfad-4a47-b89a-d5c9de731ee7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06c0cbf9-bfad-4a47-b89a-d5c9de731ee7
Content-Type: application/json

--- request body ---
{"handle":"qa-5df73c15448a","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-06c0cbf9-bfad-4a47-b89a-d5c9de731ee7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-06c0cbf9-bfad-4a47-b89a-d5c9de731ee7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-270ce3ed-55c9-4600-bc6e-0c4520101020

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-270ce3ed-55c9-4600-bc6e-0c4520101020
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-270ce3ed-55c9-4600-bc6e-0c4520101020
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-215d56fa-5dba-4cb8-a762-fd6ae0c450bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-215d56fa-5dba-4cb8-a762-fd6ae0c450bf
Content-Type: application/json

--- request body ---
{"handle":"qa-c14ae254ece1","password":"****"}

--- response: 401 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-215d56fa-5dba-4cb8-a762-fd6ae0c450bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-215d56fa-5dba-4cb8-a762-fd6ae0c450bf"}
```

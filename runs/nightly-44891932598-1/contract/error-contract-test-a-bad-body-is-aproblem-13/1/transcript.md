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
| 1 | `POST /v1/accounts` | 201 | 51 | `qa-e823f43c-7fb7-48a3-ae8b-eceed29ebd5d` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-d031d5b1-48c8-481a-93bf-c99a192107f3` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-94fcbca1-693a-4a9d-9791-27210e2bf46d` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-d084ba0a-2e5a-402f-959b-5d1fb9ea2121` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 46 | `qa-3dd47f10-85f6-40e1-b1e9-f0376d625950` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-14ac6a4f-4830-4708-8411-235db9ad3893` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-8b020ae0-3938-4d5f-9c24-4f5890de9b00` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-ad29402b-5e4c-403c-a624-0ba295bd8c9f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-6dcc1f27-87a3-4c29-bb63-b72a2af6ca34` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-cc1cf43c-925e-496f-9958-1f9aef7da452` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e823f43c-7fb7-48a3-ae8b-eceed29ebd5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e823f43c-7fb7-48a3-ae8b-eceed29ebd5d
Content-Type: application/json

--- request body ---
{"handle":"qa-95cbf668e627","displayName":"QA 95cbf668e627","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-e823f43c-7fb7-48a3-ae8b-eceed29ebd5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 6
Location: /v1/accounts/qa-95cbf668e627
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba1e062b-f02e-4559-b343-ab60d4a53e4b","handle":"qa-95cbf668e627","displayName":"QA 95cbf668e627","region":"eu","role":"user","createdAt":"2026-11-21T09:57:12.263114666Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d031d5b1-48c8-481a-93bf-c99a192107f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d031d5b1-48c8-481a-93bf-c99a192107f3
Content-Type: application/json

--- request body ---
{"handle":"qa-d3a21a862915","displayName":"QA d3a21a862915","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-d031d5b1-48c8-481a-93bf-c99a192107f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 6
Location: /v1/accounts/qa-d3a21a862915
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9decdd7e-9538-4a6f-ac96-518885578d2a","handle":"qa-d3a21a862915","displayName":"QA d3a21a862915","region":"eu","role":"user","createdAt":"2026-11-21T09:57:12.342852186Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-94fcbca1-693a-4a9d-9791-27210e2bf46d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94fcbca1-693a-4a9d-9791-27210e2bf46d
Content-Type: application/json

--- request body ---
{"handle":"qa-95cbf668e627","password":"****"}

--- response: 200 in 46 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-94fcbca1-693a-4a9d-9791-27210e2bf46d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ba1e062b-f02e-4559-b343-ab60d4a53e4b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d084ba0a-2e5a-402f-959b-5d1fb9ea2121

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d084ba0a-2e5a-402f-959b-5d1fb9ea2121
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d3a21a862915","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-d084ba0a-2e5a-402f-959b-5d1fb9ea2121
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
Location: /v1/conversations/cnv_61f12827-12a6-495d-bf27-da54ed76f23a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_61f12827-12a6-495d-bf27-da54ed76f23a","subject":"Error contract","status":"open","region":"eu","participants":["qa-95cbf668e627","qa-d3a21a862915"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:12.450600836Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_61f12827-12a6-495d-bf27-da54ed76f23a/messages
correlation: qa-3dd47f10-85f6-40e1-b1e9-f0376d625950

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3dd47f10-85f6-40e1-b1e9-f0376d625950
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 46 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3dd47f10-85f6-40e1-b1e9-f0376d625950
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_61f12827-12a6-495d-bf27-da54ed76f23a/messages","correlationId":"qa-3dd47f10-85f6-40e1-b1e9-f0376d625950"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-14ac6a4f-4830-4708-8411-235db9ad3893

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14ac6a4f-4830-4708-8411-235db9ad3893
Content-Type: application/json

--- request body ---
{"handle":"qa-d3a21a862915","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-14ac6a4f-4830-4708-8411-235db9ad3893
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9decdd7e-9538-4a6f-ac96-518885578d2a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8b020ae0-3938-4d5f-9c24-4f5890de9b00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b020ae0-3938-4d5f-9c24-4f5890de9b00
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8b020ae0-3938-4d5f-9c24-4f5890de9b00
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
correlation: qa-ad29402b-5e4c-403c-a624-0ba295bd8c9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad29402b-5e4c-403c-a624-0ba295bd8c9f
Content-Type: application/json

--- request body ---
{"handle":"qa-d3a21a862915","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ad29402b-5e4c-403c-a624-0ba295bd8c9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ad29402b-5e4c-403c-a624-0ba295bd8c9f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6dcc1f27-87a3-4c29-bb63-b72a2af6ca34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dcc1f27-87a3-4c29-bb63-b72a2af6ca34
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6dcc1f27-87a3-4c29-bb63-b72a2af6ca34
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
correlation: qa-cc1cf43c-925e-496f-9958-1f9aef7da452

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc1cf43c-925e-496f-9958-1f9aef7da452
Content-Type: application/json

--- request body ---
{"handle":"qa-95cbf668e627","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc1cf43c-925e-496f-9958-1f9aef7da452
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cc1cf43c-925e-496f-9958-1f9aef7da452"}
```

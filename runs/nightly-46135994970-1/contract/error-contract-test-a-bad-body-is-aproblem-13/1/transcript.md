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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-aa4a6bdb-7150-41e5-b549-923f8ff2db55` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-782ce514-aa8d-402c-b585-8ebbb262a9a2` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-6ac5eb3a-70a6-432a-8b6e-b522da71c0de` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-91e0abb9-36d7-4f57-b9ee-3c8e8c595eec` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 40 | `qa-b3359add-1fc7-4638-be0c-c384936dbb0f` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-6565abe5-dac8-4565-a6db-c1c8a6c91294` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-71a7c662-f21d-4f2f-b39f-1a3dc1e301ea` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-8480ef91-55b7-4d7e-82aa-5f99b07306bb` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-a91ac1a1-b000-46a9-89a6-ca1802f0221d` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-637efac0-419b-48c7-81c6-7029b2dc475d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aa4a6bdb-7150-41e5-b549-923f8ff2db55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa4a6bdb-7150-41e5-b549-923f8ff2db55
Content-Type: application/json

--- request body ---
{"handle":"qa-49b2c8333540","displayName":"QA 49b2c8333540","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa4a6bdb-7150-41e5-b549-923f8ff2db55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 6
Location: /v1/accounts/qa-49b2c8333540
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1ec273f1-b768-48d8-a76c-d734bd8c27ea","handle":"qa-49b2c8333540","displayName":"QA 49b2c8333540","region":"eu","role":"user","createdAt":"2026-11-28T10:37:25.413414221Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-782ce514-aa8d-402c-b585-8ebbb262a9a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-782ce514-aa8d-402c-b585-8ebbb262a9a2
Content-Type: application/json

--- request body ---
{"handle":"qa-be4f4ab5b651","displayName":"QA be4f4ab5b651","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-782ce514-aa8d-402c-b585-8ebbb262a9a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 6
Location: /v1/accounts/qa-be4f4ab5b651
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a76b85c3-8c5a-419b-a587-d8006717fc4d","handle":"qa-be4f4ab5b651","displayName":"QA be4f4ab5b651","region":"eu","role":"user","createdAt":"2026-11-28T10:37:25.461468185Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6ac5eb3a-70a6-432a-8b6e-b522da71c0de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ac5eb3a-70a6-432a-8b6e-b522da71c0de
Content-Type: application/json

--- request body ---
{"handle":"qa-49b2c8333540","password":"****"}

--- response: 200 in 35 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ac5eb3a-70a6-432a-8b6e-b522da71c0de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1ec273f1-b768-48d8-a76c-d734bd8c27ea"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-91e0abb9-36d7-4f57-b9ee-3c8e8c595eec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91e0abb9-36d7-4f57-b9ee-3c8e8c595eec
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-be4f4ab5b651","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-91e0abb9-36d7-4f57-b9ee-3c8e8c595eec
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
Location: /v1/conversations/cnv_f801e92d-f58b-4a9c-8b0b-4388b155a3f7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f801e92d-f58b-4a9c-8b0b-4388b155a3f7","subject":"Error contract","status":"open","region":"eu","participants":["qa-49b2c8333540","qa-be4f4ab5b651"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:25.544683932Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_f801e92d-f58b-4a9c-8b0b-4388b155a3f7/messages
correlation: qa-b3359add-1fc7-4638-be0c-c384936dbb0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3359add-1fc7-4638-be0c-c384936dbb0f
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 40 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b3359add-1fc7-4638-be0c-c384936dbb0f
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_f801e92d-f58b-4a9c-8b0b-4388b155a3f7/messages","correlationId":"qa-b3359add-1fc7-4638-be0c-c384936dbb0f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6565abe5-dac8-4565-a6db-c1c8a6c91294

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6565abe5-dac8-4565-a6db-c1c8a6c91294
Content-Type: application/json

--- request body ---
{"handle":"qa-be4f4ab5b651","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-6565abe5-dac8-4565-a6db-c1c8a6c91294
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a76b85c3-8c5a-419b-a587-d8006717fc4d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-71a7c662-f21d-4f2f-b39f-1a3dc1e301ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71a7c662-f21d-4f2f-b39f-1a3dc1e301ea
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-71a7c662-f21d-4f2f-b39f-1a3dc1e301ea
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
correlation: qa-8480ef91-55b7-4d7e-82aa-5f99b07306bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8480ef91-55b7-4d7e-82aa-5f99b07306bb
Content-Type: application/json

--- request body ---
{"handle":"qa-be4f4ab5b651","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8480ef91-55b7-4d7e-82aa-5f99b07306bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8480ef91-55b7-4d7e-82aa-5f99b07306bb"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a91ac1a1-b000-46a9-89a6-ca1802f0221d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a91ac1a1-b000-46a9-89a6-ca1802f0221d
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a91ac1a1-b000-46a9-89a6-ca1802f0221d
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
correlation: qa-637efac0-419b-48c7-81c6-7029b2dc475d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-637efac0-419b-48c7-81c6-7029b2dc475d
Content-Type: application/json

--- request body ---
{"handle":"qa-49b2c8333540","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-637efac0-419b-48c7-81c6-7029b2dc475d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-637efac0-419b-48c7-81c6-7029b2dc475d"}
```

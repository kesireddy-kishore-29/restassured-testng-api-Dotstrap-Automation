# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-69d3d9e8-9f61-4cc3-b04c-5121c45f6a58` |
| 2 | `POST /v1/accounts` | 201 | 53 | `qa-67adca85-b950-49da-9907-7b21f2947c20` |
| 3 | `POST /v1/accounts` | 201 | 20 | `qa-0430c6ce-0f2a-4ef7-b4d7-8eec87202cfb` |
| 4 | `POST /v1/auth/token` | 200 | 15 | `qa-7f38c7ab-db1e-4cca-b738-1c7170068263` |
| 5 | `POST /v1/conversations` | 201 | 15 | `qa-f334314c-0cc7-4cf0-b4ea-9bedd8834f22` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-3bdcc3f7-cfcc-4230-ba9c-8d042cab25de` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 8 | `qa-6a8d2508-b73f-4f7d-be9d-3c2cc546e191` |
| 8 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-abf4b77a-554b-46e6-9eb8-7b70a12aca72` |
| 9 | `POST /v1/auth/token` | 401 | 30 | `qa-34126557-e0de-4011-b500-9a6524de0030` |
| 10 | `POST /v1/auth/token` | 200 | 36 | `qa-f42b71ec-a3a5-4702-b5c2-2f76a3f5aa9c` |
| 11 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-74d23d7e-b231-4f2e-8a5f-ca73027d0e10` |
| 12 | `POST /v1/auth/token` | 401 | 48 | `qa-8c10d80b-1bc9-4233-96cf-41711436880c` |
| 13 | `DELETE /v1/accounts/me` | 204 | 44 | `qa-6c48c3e1-f264-48a0-a549-426d03149f2f` |
| 14 | `POST /v1/auth/token` | 401 | 34 | `qa-dab37883-7f12-49b7-825c-cf81d038955d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-69d3d9e8-9f61-4cc3-b04c-5121c45f6a58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69d3d9e8-9f61-4cc3-b04c-5121c45f6a58
Content-Type: application/json

--- request body ---
{"handle":"qa-4f6e9c72b00b","displayName":"QA 4f6e9c72b00b","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-69d3d9e8-9f61-4cc3-b04c-5121c45f6a58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 10
Location: /v1/accounts/qa-4f6e9c72b00b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f1807473-6baa-469c-bb24-16f683fe134e","handle":"qa-4f6e9c72b00b","displayName":"QA 4f6e9c72b00b","region":"eu","role":"user","createdAt":"2026-11-09T09:56:01.957376031Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-67adca85-b950-49da-9907-7b21f2947c20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67adca85-b950-49da-9907-7b21f2947c20
Content-Type: application/json

--- request body ---
{"handle":"qa-3cc8788279d8","displayName":"QA 3cc8788279d8","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-67adca85-b950-49da-9907-7b21f2947c20
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 10
Location: /v1/accounts/qa-3cc8788279d8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_69a01dbc-2774-4310-b71b-c9d66ce23241","handle":"qa-3cc8788279d8","displayName":"QA 3cc8788279d8","region":"eu","role":"user","createdAt":"2026-11-09T09:56:02.014098283Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-0430c6ce-0f2a-4ef7-b4d7-8eec87202cfb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0430c6ce-0f2a-4ef7-b4d7-8eec87202cfb
Content-Type: application/json

--- request body ---
{"handle":"qa-ef4e79c730d3","displayName":"QA ef4e79c730d3","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-0430c6ce-0f2a-4ef7-b4d7-8eec87202cfb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 10
Location: /v1/accounts/qa-ef4e79c730d3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_28e9087e-8274-4aa1-87a1-6a84e7347fb7","handle":"qa-ef4e79c730d3","displayName":"QA ef4e79c730d3","region":"eu","role":"user","createdAt":"2026-11-09T09:56:02.055760812Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-7f38c7ab-db1e-4cca-b738-1c7170068263

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f38c7ab-db1e-4cca-b738-1c7170068263
Content-Type: application/json

--- request body ---
{"handle":"qa-4f6e9c72b00b","password":"****"}

--- response: 200 in 15 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f38c7ab-db1e-4cca-b738-1c7170068263
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f1807473-6baa-469c-bb24-16f683fe134e"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-f334314c-0cc7-4cf0-b4ea-9bedd8834f22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f334314c-0cc7-4cf0-b4ea-9bedd8834f22
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3cc8788279d8","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-f334314c-0cc7-4cf0-b4ea-9bedd8834f22
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
Location: /v1/conversations/cnv_e1e0c6c5-6b23-4d08-94a2-557ef28f918b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e1e0c6c5-6b23-4d08-94a2-557ef28f918b","subject":"Error contract","status":"open","region":"eu","participants":["qa-4f6e9c72b00b","qa-3cc8788279d8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:02.094466785Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3bdcc3f7-cfcc-4230-ba9c-8d042cab25de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bdcc3f7-cfcc-4230-ba9c-8d042cab25de
Content-Type: application/json

--- request body ---
{"handle":"qa-ef4e79c730d3","password":"****"}

--- response: 200 in 23 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-3bdcc3f7-cfcc-4230-ba9c-8d042cab25de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_28e9087e-8274-4aa1-87a1-6a84e7347fb7"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_e1e0c6c5-6b23-4d08-94a2-557ef28f918b/read
correlation: qa-6a8d2508-b73f-4f7d-be9d-3c2cc546e191

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a8d2508-b73f-4f7d-be9d-3c2cc546e191
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6a8d2508-b73f-4f7d-be9d-3c2cc546e191
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
Content-Length: 290

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_e1e0c6c5-6b23-4d08-94a2-557ef28f918b/read","correlationId":"qa-6a8d2508-b73f-4f7d-be9d-3c2cc546e191"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-abf4b77a-554b-46e6-9eb8-7b70a12aca72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abf4b77a-554b-46e6-9eb8-7b70a12aca72
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-abf4b77a-554b-46e6-9eb8-7b70a12aca72
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
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-34126557-e0de-4011-b500-9a6524de0030

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34126557-e0de-4011-b500-9a6524de0030
Content-Type: application/json

--- request body ---
{"handle":"qa-ef4e79c730d3","password":"****"}

--- response: 401 in 30 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-34126557-e0de-4011-b500-9a6524de0030
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 519
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-34126557-e0de-4011-b500-9a6524de0030"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-f42b71ec-a3a5-4702-b5c2-2f76a3f5aa9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f42b71ec-a3a5-4702-b5c2-2f76a3f5aa9c
Content-Type: application/json

--- request body ---
{"handle":"qa-3cc8788279d8","password":"****"}

--- response: 200 in 36 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-f42b71ec-a3a5-4702-b5c2-2f76a3f5aa9c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_69a01dbc-2774-4310-b71b-c9d66ce23241"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-74d23d7e-b231-4f2e-8a5f-ca73027d0e10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74d23d7e-b231-4f2e-8a5f-ca73027d0e10
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-74d23d7e-b231-4f2e-8a5f-ca73027d0e10
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-8c10d80b-1bc9-4233-96cf-41711436880c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c10d80b-1bc9-4233-96cf-41711436880c
Content-Type: application/json

--- request body ---
{"handle":"qa-3cc8788279d8","password":"****"}

--- response: 401 in 48 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c10d80b-1bc9-4233-96cf-41711436880c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8c10d80b-1bc9-4233-96cf-41711436880c"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6c48c3e1-f264-48a0-a549-426d03149f2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c48c3e1-f264-48a0-a549-426d03149f2f
Content-Type: application/json

--- response: 204 in 44 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6c48c3e1-f264-48a0-a549-426d03149f2f
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
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-dab37883-7f12-49b7-825c-cf81d038955d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dab37883-7f12-49b7-825c-cf81d038955d
Content-Type: application/json

--- request body ---
{"handle":"qa-4f6e9c72b00b","password":"****"}

--- response: 401 in 34 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dab37883-7f12-49b7-825c-cf81d038955d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dab37883-7f12-49b7-825c-cf81d038955d"}
```

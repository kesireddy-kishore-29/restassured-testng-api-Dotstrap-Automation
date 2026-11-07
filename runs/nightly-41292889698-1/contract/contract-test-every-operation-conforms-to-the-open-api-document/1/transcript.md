# Transcript: Every operation in the OpenAPI document answers as documented (checked per response)

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#everyOperationConformsToTheOpenApiDocument` |
| Features | FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 23 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-88c3210c-dacf-4e4a-a09a-dea00615baaf` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-17babdd6-a5e5-4df9-a4db-67dd952b2c1a` |
| 3 | `GET /health` | 200 | 10 | `qa-0c56c000-c940-489c-aaf0-686c516711d3` |
| 4 | `POST /v1/auth/token` | 200 | 14 | `qa-60abe17a-d51e-44de-bf6b-5b817ed72db5` |
| 5 | `GET /v1/accounts/me` | 200 | 12 | `qa-dafbf5a5-5abd-46b8-aa0e-0c37fbfc2b66` |
| 6 | `PATCH /v1/accounts/me` | 200 | 6 | `qa-0582a2fd-ec1c-4ecf-8d67-04d5319e15d6` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 9 | `qa-8a56c9d4-3f13-4967-961d-59df00d89e2b` |
| 8 | `POST /v1/conversations` | 201 | 14 | `qa-511d2b1d-5ad5-4a9f-a3b3-e49d26656794` |
| 9 | `GET /v1/conversations` | 200 | 11 | `qa-65d0a6c7-5db8-4d84-ab11-8afac1102452` |
| 10 | `POST /v1/auth/token` | 200 | 8 | `qa-09b9ad37-07a1-43b4-b3eb-174b8069884c` |
| 11 | `GET /v1/conversations/{id}` | 200 | 6 | `qa-acf8fbdc-ef26-48d4-b2d1-c5d93b043922` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 7 | `qa-2d16e5c7-2bc3-41e0-9b56-a49227e43596` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 8 | `qa-bd351e6e-6d02-4de8-b62e-7903c71765ef` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 5 | `qa-32cab9df-ec3f-4140-a761-63208df14f6c` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 11 | `qa-15c4ed07-87de-4a84-b19b-06a717b49cbb` |
| 16 | `GET /v1/credits/balance` | 200 | 7 | `qa-0793bb85-1ab5-4970-b03a-a1c39ada946c` |
| 17 | `GET /v1/credits/ledger` | 200 | 5 | `qa-3844c1bb-7002-46e7-92e3-e0135a608a84` |
| 18 | `POST /v1/credits/purchases` | 201 | 5 | `qa-c94813eb-efd6-4f83-804d-9e46475176d6` |
| 19 | `GET /v1/admin/stats` | 403 | 5 | `qa-5ada2d12-5257-42ac-9ffb-f65fd1ccb647` |
| 20 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-1613dfe1-bea1-49a7-b6df-9f307ec0b0ba` |
| 21 | `POST /v1/auth/token` | 401 | 5 | `qa-a031fb74-8e57-4bd8-a0c2-faa536787295` |
| 22 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-0a3d5ef5-9f24-41a6-adf0-e45e48239312` |
| 23 | `POST /v1/auth/token` | 401 | 4 | `qa-19bd55b5-face-4744-a3d4-abe79d880222` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-88c3210c-dacf-4e4a-a09a-dea00615baaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88c3210c-dacf-4e4a-a09a-dea00615baaf
Content-Type: application/json

--- request body ---
{"handle":"qa-7b11e1ec3828","displayName":"QA 7b11e1ec3828","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-88c3210c-dacf-4e4a-a09a-dea00615baaf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 6
Location: /v1/accounts/qa-7b11e1ec3828
X-Served-Region: eu
Content-Length: 181

{"id":"acc_870b517b-37d7-4d15-8478-4705abf5a45d","handle":"qa-7b11e1ec3828","displayName":"QA 7b11e1ec3828","region":"eu","role":"user","createdAt":"2026-11-01T09:23:24.712949024Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-17babdd6-a5e5-4df9-a4db-67dd952b2c1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17babdd6-a5e5-4df9-a4db-67dd952b2c1a
Content-Type: application/json

--- request body ---
{"handle":"qa-c6bfc23d7258","displayName":"QA c6bfc23d7258","password":"****","region":"us"}

--- response: 201 in 27 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-17babdd6-a5e5-4df9-a4db-67dd952b2c1a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 6
Location: /v1/accounts/qa-c6bfc23d7258
X-Served-Region: us
Content-Length: 181

{"id":"acc_a3992030-37d9-4793-ac1e-ad77094d2519","handle":"qa-c6bfc23d7258","displayName":"QA c6bfc23d7258","region":"us","role":"user","createdAt":"2026-11-01T09:23:24.742452757Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-0c56c000-c940-489c-aaf0-686c516711d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c56c000-c940-489c-aaf0-686c516711d3
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c56c000-c940-489c-aaf0-686c516711d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 95

{"status":"UP","version":"1.0.0","region":"eu","regions":["in","eu","us"],"faultsEnabled":true}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-60abe17a-d51e-44de-bf6b-5b817ed72db5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60abe17a-d51e-44de-bf6b-5b817ed72db5
Content-Type: application/json

--- request body ---
{"handle":"qa-7b11e1ec3828","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-60abe17a-d51e-44de-bf6b-5b817ed72db5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_870b517b-37d7-4d15-8478-4705abf5a45d"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-dafbf5a5-5abd-46b8-aa0e-0c37fbfc2b66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dafbf5a5-5abd-46b8-aa0e-0c37fbfc2b66
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-dafbf5a5-5abd-46b8-aa0e-0c37fbfc2b66
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
Content-Length: 181

{"id":"acc_870b517b-37d7-4d15-8478-4705abf5a45d","handle":"qa-7b11e1ec3828","displayName":"QA 7b11e1ec3828","region":"eu","role":"user","createdAt":"2026-11-01T09:23:24.712949024Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-0582a2fd-ec1c-4ecf-8d67-04d5319e15d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0582a2fd-ec1c-4ecf-8d67-04d5319e15d6
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-0582a2fd-ec1c-4ecf-8d67-04d5319e15d6
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
Content-Length: 178

{"id":"acc_870b517b-37d7-4d15-8478-4705abf5a45d","handle":"qa-7b11e1ec3828","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-01T09:23:24.712949024Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-c6bfc23d7258
correlation: qa-8a56c9d4-3f13-4967-961d-59df00d89e2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a56c9d4-3f13-4967-961d-59df00d89e2b
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a56c9d4-3f13-4967-961d-59df00d89e2b
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
Content-Length: 74

{"handle":"qa-c6bfc23d7258","displayName":"QA c6bfc23d7258","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-511d2b1d-5ad5-4a9f-a3b3-e49d26656794

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-511d2b1d-5ad5-4a9f-a3b3-e49d26656794
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c6bfc23d7258","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-511d2b1d-5ad5-4a9f-a3b3-e49d26656794
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_39e707e7-e08d-4f7e-8620-bb56d6b43f73
X-Data-Region: us
Content-Length: 238

{"id":"cnv_39e707e7-e08d-4f7e-8620-bb56d6b43f73","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-7b11e1ec3828","qa-c6bfc23d7258"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:24.851487518Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-65d0a6c7-5db8-4d84-ab11-8afac1102452

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65d0a6c7-5db8-4d84-ab11-8afac1102452
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-65d0a6c7-5db8-4d84-ab11-8afac1102452
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 260

{"items":[{"id":"cnv_39e707e7-e08d-4f7e-8620-bb56d6b43f73","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-7b11e1ec3828","qa-c6bfc23d7258"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:24.851487518Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-09b9ad37-07a1-43b4-b3eb-174b8069884c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09b9ad37-07a1-43b4-b3eb-174b8069884c
Content-Type: application/json

--- request body ---
{"handle":"qa-c6bfc23d7258","password":"****"}

--- response: 200 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-09b9ad37-07a1-43b4-b3eb-174b8069884c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a3992030-37d9-4793-ac1e-ad77094d2519"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_39e707e7-e08d-4f7e-8620-bb56d6b43f73
correlation: qa-acf8fbdc-ef26-48d4-b2d1-c5d93b043922

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-acf8fbdc-ef26-48d4-b2d1-c5d93b043922
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-acf8fbdc-ef26-48d4-b2d1-c5d93b043922
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
X-Served-Region: us
X-Data-Region: us
Content-Length: 238

{"id":"cnv_39e707e7-e08d-4f7e-8620-bb56d6b43f73","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-7b11e1ec3828","qa-c6bfc23d7258"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-01T09:23:24.851487518Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_39e707e7-e08d-4f7e-8620-bb56d6b43f73/messages
correlation: qa-2d16e5c7-2bc3-41e0-9b56-a49227e43596

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d16e5c7-2bc3-41e0-9b56-a49227e43596
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d16e5c7-2bc3-41e0-9b56-a49227e43596
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
X-Served-Region: us
Content-Length: 215

{"items":[{"id":"msg_f99a72e9-c041-4346-9719-c5a9b06754da","conversationId":"cnv_39e707e7-e08d-4f7e-8620-bb56d6b43f73","sender":"qa-7b11e1ec3828","body":"Hi","createdAt":"2026-11-01T09:23:24.851492185Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_39e707e7-e08d-4f7e-8620-bb56d6b43f73/messages
correlation: qa-bd351e6e-6d02-4de8-b62e-7903c71765ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd351e6e-6d02-4de8-b62e-7903c71765ef
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd351e6e-6d02-4de8-b62e-7903c71765ef
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
X-Served-Region: us
Content-Length: 196

{"id":"msg_ec8624d1-7045-4854-9a5e-5df17f59621e","conversationId":"cnv_39e707e7-e08d-4f7e-8620-bb56d6b43f73","sender":"qa-c6bfc23d7258","body":"Reply","createdAt":"2026-11-01T09:23:24.939134186Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_39e707e7-e08d-4f7e-8620-bb56d6b43f73/read
correlation: qa-32cab9df-ec3f-4140-a761-63208df14f6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32cab9df-ec3f-4140-a761-63208df14f6c
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-32cab9df-ec3f-4140-a761-63208df14f6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 77

{"conversationId":"cnv_39e707e7-e08d-4f7e-8620-bb56d6b43f73","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_39e707e7-e08d-4f7e-8620-bb56d6b43f73/close
correlation: qa-15c4ed07-87de-4a84-b19b-06a717b49cbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15c4ed07-87de-4a84-b19b-06a717b49cbb
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-15c4ed07-87de-4a84-b19b-06a717b49cbb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 284

{"id":"cnv_39e707e7-e08d-4f7e-8620-bb56d6b43f73","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-7b11e1ec3828","qa-c6bfc23d7258"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-01T09:23:24.851487518Z","closedAt":"2026-11-01T09:23:24.965455108Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-0793bb85-1ab5-4970-b03a-a1c39ada946c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0793bb85-1ab5-4970-b03a-a1c39ada946c
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-0793bb85-1ab5-4970-b03a-a1c39ada946c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 89

{"balance":4,"currency":"credits","accountId":"acc_870b517b-37d7-4d15-8478-4705abf5a45d"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-3844c1bb-7002-46e7-92e3-e0135a608a84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3844c1bb-7002-46e7-92e3-e0135a608a84
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-3844c1bb-7002-46e7-92e3-e0135a608a84
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 393

{"items":[{"id":"led_7f58567e-a56b-4e56-a4e5-be7222caa0ea","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-01T09:23:24.712960381Z"},{"id":"led_47a7ff91-cae7-4280-952f-d5e7536a9e04","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_39e707e7-e08d-4f7e-8620-bb56d6b43f73","createdAt":"2026-11-01T09:23:24.851478634Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c94813eb-efd6-4f83-804d-9e46475176d6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-7de49455e6d1416d944cf9dbf49c6680
X-Correlation-Id: qa-c94813eb-efd6-4f83-804d-9e46475176d6
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-c94813eb-efd6-4f83-804d-9e46475176d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/credits/purchases/pur_d2424083-8473-4288-8bb4-1c86d56caedd
Content-Length: 144

{"id":"pur_d2424083-8473-4288-8bb4-1c86d56caedd","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-01T09:23:25.002227707Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-5ada2d12-5257-42ac-9ffb-f65fd1ccb647

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ada2d12-5257-42ac-9ffb-f65fd1ccb647
Content-Type: application/json

--- response: 403 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5ada2d12-5257-42ac-9ffb-f65fd1ccb647
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-5ada2d12-5257-42ac-9ffb-f65fd1ccb647"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1613dfe1-bea1-49a7-b6df-9f307ec0b0ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1613dfe1-bea1-49a7-b6df-9f307ec0b0ba
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1613dfe1-bea1-49a7-b6df-9f307ec0b0ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: us
```

## 21. POST /v1/auth/token

```text
#21 POST http://localhost:7070/v1/auth/token
correlation: qa-a031fb74-8e57-4bd8-a0c2-faa536787295

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a031fb74-8e57-4bd8-a0c2-faa536787295
Content-Type: application/json

--- request body ---
{"handle":"qa-c6bfc23d7258","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a031fb74-8e57-4bd8-a0c2-faa536787295
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a031fb74-8e57-4bd8-a0c2-faa536787295"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0a3d5ef5-9f24-41a6-adf0-e45e48239312

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a3d5ef5-9f24-41a6-adf0-e45e48239312
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0a3d5ef5-9f24-41a6-adf0-e45e48239312
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
```

## 23. POST /v1/auth/token

```text
#23 POST http://localhost:7070/v1/auth/token
correlation: qa-19bd55b5-face-4744-a3d4-abe79d880222

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19bd55b5-face-4744-a3d4-abe79d880222
Content-Type: application/json

--- request body ---
{"handle":"qa-7b11e1ec3828","password":"****"}

--- response: 401 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-19bd55b5-face-4744-a3d4-abe79d880222
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-19bd55b5-face-4744-a3d4-abe79d880222"}
```

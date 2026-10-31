# Transcript: The administrator gets the service statistics

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#theAdministratorGetsTheStatistics` |
| Features | FEAT-AUTHZ-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 9 | `qa-5f399201-d553-4038-9116-12df65f3aba5` |
| 2 | `POST /v1/accounts` | 201 | 9 | `qa-60af61ed-5504-48c6-bb90-6431f156d9d7` |
| 3 | `POST /v1/auth/token` | 200 | 11 | `qa-424761f1-a720-442d-a569-afe3494317e8` |
| 4 | `POST /v1/conversations` | 201 | 3 | `qa-dd287f9f-0a85-478b-9059-61831c05d15f` |
| 5 | `POST /v1/auth/token` | 200 | 9 | `qa-319097ad-7e09-444d-81eb-3bee701bbffa` |
| 6 | `GET /v1/admin/stats` | 200 | 16 | `qa-7c5a3353-d7c8-4b45-a959-b119890d2418` |
| 7 | `POST /v1/auth/token` | 200 | 9 | `qa-75d6a6b9-0f74-4caa-b214-d33312b8233e` |
| 8 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-7b610527-fcfd-4e11-999c-df91dd74effd` |
| 9 | `POST /v1/auth/token` | 401 | 5 | `qa-036a35f7-5f99-49fd-9f94-4fded7f3f4e2` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-ae6a2e37-a03e-4dcd-ac2d-4ae156128785` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-cd90d2d3-9bb7-4c93-9db7-43117a12ca0d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5f399201-d553-4038-9116-12df65f3aba5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f399201-d553-4038-9116-12df65f3aba5
Content-Type: application/json

--- request body ---
{"handle":"qa-fb5b0233e320","displayName":"QA fb5b0233e320","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f399201-d553-4038-9116-12df65f3aba5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 7
Location: /v1/accounts/qa-fb5b0233e320
X-Served-Region: eu
Content-Length: 181

{"id":"acc_667af5bf-ffe9-4c0c-844c-308e817bfe05","handle":"qa-fb5b0233e320","displayName":"QA fb5b0233e320","region":"eu","role":"user","createdAt":"2026-10-24T07:25:04.175999149Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-60af61ed-5504-48c6-bb90-6431f156d9d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60af61ed-5504-48c6-bb90-6431f156d9d7
Content-Type: application/json

--- request body ---
{"handle":"qa-abb4e2b43793","displayName":"QA abb4e2b43793","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-60af61ed-5504-48c6-bb90-6431f156d9d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 7
Location: /v1/accounts/qa-abb4e2b43793
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6c059ac5-99dc-44b5-89a8-2c832d937faa","handle":"qa-abb4e2b43793","displayName":"QA abb4e2b43793","region":"eu","role":"user","createdAt":"2026-10-24T07:25:04.187524565Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-424761f1-a720-442d-a569-afe3494317e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-424761f1-a720-442d-a569-afe3494317e8
Content-Type: application/json

--- request body ---
{"handle":"qa-fb5b0233e320","password":"****"}

--- response: 200 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-424761f1-a720-442d-a569-afe3494317e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_667af5bf-ffe9-4c0c-844c-308e817bfe05"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-dd287f9f-0a85-478b-9059-61831c05d15f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd287f9f-0a85-478b-9059-61831c05d15f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-abb4e2b43793","subject":"Error contract","message":"Hi"}

--- response: 201 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd287f9f-0a85-478b-9059-61831c05d15f
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
Location: /v1/conversations/cnv_82a7a6b4-d53f-4925-914c-063a99a8a6fc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_82a7a6b4-d53f-4925-914c-063a99a8a6fc","subject":"Error contract","status":"open","region":"eu","participants":["qa-fb5b0233e320","qa-abb4e2b43793"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:04.211965779Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-319097ad-7e09-444d-81eb-3bee701bbffa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-319097ad-7e09-444d-81eb-3bee701bbffa
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-319097ad-7e09-444d-81eb-3bee701bbffa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3d4b1ea0-8aaf-4771-8d52-b968983883ca"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-7c5a3353-d7c8-4b45-a959-b119890d2418

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c5a3353-d7c8-4b45-a959-b119890d2418
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c5a3353-d7c8-4b45-a959-b119890d2418
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
Content-Length: 46

{"accounts":5,"conversations":2,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-75d6a6b9-0f74-4caa-b214-d33312b8233e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75d6a6b9-0f74-4caa-b214-d33312b8233e
Content-Type: application/json

--- request body ---
{"handle":"qa-abb4e2b43793","password":"****"}

--- response: 200 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-75d6a6b9-0f74-4caa-b214-d33312b8233e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6c059ac5-99dc-44b5-89a8-2c832d937faa"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7b610527-fcfd-4e11-999c-df91dd74effd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b610527-fcfd-4e11-999c-df91dd74effd
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7b610527-fcfd-4e11-999c-df91dd74effd
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-036a35f7-5f99-49fd-9f94-4fded7f3f4e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-036a35f7-5f99-49fd-9f94-4fded7f3f4e2
Content-Type: application/json

--- request body ---
{"handle":"qa-abb4e2b43793","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-036a35f7-5f99-49fd-9f94-4fded7f3f4e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-036a35f7-5f99-49fd-9f94-4fded7f3f4e2"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ae6a2e37-a03e-4dcd-ac2d-4ae156128785

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae6a2e37-a03e-4dcd-ac2d-4ae156128785
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ae6a2e37-a03e-4dcd-ac2d-4ae156128785
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-cd90d2d3-9bb7-4c93-9db7-43117a12ca0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd90d2d3-9bb7-4c93-9db7-43117a12ca0d
Content-Type: application/json

--- request body ---
{"handle":"qa-fb5b0233e320","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cd90d2d3-9bb7-4c93-9db7-43117a12ca0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cd90d2d3-9bb7-4c93-9db7-43117a12ca0d"}
```

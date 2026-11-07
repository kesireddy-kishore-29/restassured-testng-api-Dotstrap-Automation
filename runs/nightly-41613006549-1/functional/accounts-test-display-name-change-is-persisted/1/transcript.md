# Transcript: A new display name is stored and returned

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#displayNameChangeIsPersisted` |
| Features | FEAT-ACCT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 413 | `qa-eb2f6612-df45-44a1-817b-063bf0d4cb43` |
| 2 | `POST /v1/auth/token` | 200 | 70 | `qa-ce09454a-7bd9-4c19-a4ed-bb0ebf4863de` |
| 3 | `PATCH /v1/accounts/me` | 200 | 72 | `qa-6a4f06c3-a1ab-41f2-b205-221f7a18fc99` |
| 4 | `GET /v1/accounts/me` | 200 | 20 | `qa-c037c7ef-7cd8-42df-8977-4aad02283248` |
| 5 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-83ad82ee-fe09-4f46-b50f-f8bad0efc1af` |
| 6 | `POST /v1/auth/token` | 401 | 54 | `qa-5fe91851-348e-4dae-9b02-b249bfadf4b1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-eb2f6612-df45-44a1-817b-063bf0d4cb43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb2f6612-df45-44a1-817b-063bf0d4cb43
Content-Type: application/json

--- request body ---
{"handle":"qa-c94aada1f3dc","displayName":"QA c94aada1f3dc","password":"****","region":"eu"}

--- response: 201 in 413 ms ---
Date: Tue, 03 Nov 2026 09:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb2f6612-df45-44a1-817b-063bf0d4cb43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-c94aada1f3dc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ed93159d-b9b1-4b07-a0bb-e43f88a85c9d","handle":"qa-c94aada1f3dc","displayName":"QA c94aada1f3dc","region":"eu","role":"user","createdAt":"2026-11-03T09:41:46.228167567Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ce09454a-7bd9-4c19-a4ed-bb0ebf4863de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce09454a-7bd9-4c19-a4ed-bb0ebf4863de
Content-Type: application/json

--- request body ---
{"handle":"qa-c94aada1f3dc","password":"****"}

--- response: 200 in 70 ms ---
Date: Tue, 03 Nov 2026 09:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce09454a-7bd9-4c19-a4ed-bb0ebf4863de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ed93159d-b9b1-4b07-a0bb-e43f88a85c9d"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-6a4f06c3-a1ab-41f2-b205-221f7a18fc99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a4f06c3-a1ab-41f2-b205-221f7a18fc99
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 72 ms ---
Date: Tue, 03 Nov 2026 09:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a4f06c3-a1ab-41f2-b205-221f7a18fc99
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
Content-Length: 179

{"id":"acc_ed93159d-b9b1-4b07-a0bb-e43f88a85c9d","handle":"qa-c94aada1f3dc","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-03T09:41:46.228167567Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-c037c7ef-7cd8-42df-8977-4aad02283248

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c037c7ef-7cd8-42df-8977-4aad02283248
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Tue, 03 Nov 2026 09:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-c037c7ef-7cd8-42df-8977-4aad02283248
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
Content-Length: 179

{"id":"acc_ed93159d-b9b1-4b07-a0bb-e43f88a85c9d","handle":"qa-c94aada1f3dc","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-03T09:41:46.228167567Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-83ad82ee-fe09-4f46-b50f-f8bad0efc1af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83ad82ee-fe09-4f46-b50f-f8bad0efc1af
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-83ad82ee-fe09-4f46-b50f-f8bad0efc1af
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

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5fe91851-348e-4dae-9b02-b249bfadf4b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fe91851-348e-4dae-9b02-b249bfadf4b1
Content-Type: application/json

--- request body ---
{"handle":"qa-c94aada1f3dc","password":"****"}

--- response: 401 in 54 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5fe91851-348e-4dae-9b02-b249bfadf4b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5fe91851-348e-4dae-9b02-b249bfadf4b1"}
```

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
| 1 | `POST /v1/accounts` | 201 | 8 | `qa-5e48a470-93ab-468a-a381-3ec65b90ef14` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-79d3e4af-f467-4b7e-bb75-d65d82dbe42a` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-cd0abc69-2ad2-4fbe-ae51-3f9e5e8568d7` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-4255ee4b-3eb6-4393-8ab2-bf3087605942` |
| 5 | `POST /v1/auth/token` | 200 | 26 | `qa-0dea403c-8574-4c9c-9799-504966eb4cfb` |
| 6 | `GET /v1/admin/stats` | 200 | 11 | `qa-60fd6aec-9569-4eab-a527-d9071f62314a` |
| 7 | `POST /v1/auth/token` | 200 | 11 | `qa-4d0a06b5-48fa-4da4-8530-4f505c9d3226` |
| 8 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-449b1d51-b028-42c7-98d5-8020edc99407` |
| 9 | `POST /v1/auth/token` | 401 | 8 | `qa-82ff5873-f670-4047-971e-f90d840b31d1` |
| 10 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-edd38354-a2b0-49d2-aeac-b7fcd6c97971` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-e5f56852-6899-4590-be26-3dcaf4768c3a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5e48a470-93ab-468a-a381-3ec65b90ef14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e48a470-93ab-468a-a381-3ec65b90ef14
Content-Type: application/json

--- request body ---
{"handle":"qa-f7d53dd6ee59","displayName":"QA f7d53dd6ee59","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e48a470-93ab-468a-a381-3ec65b90ef14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 8
Location: /v1/accounts/qa-f7d53dd6ee59
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c7064a82-eb45-47e7-acc6-b51a334d663a","handle":"qa-f7d53dd6ee59","displayName":"QA f7d53dd6ee59","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.547685199Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-79d3e4af-f467-4b7e-bb75-d65d82dbe42a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79d3e4af-f467-4b7e-bb75-d65d82dbe42a
Content-Type: application/json

--- request body ---
{"handle":"qa-1b2c096047bb","displayName":"QA 1b2c096047bb","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-79d3e4af-f467-4b7e-bb75-d65d82dbe42a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 7
Location: /v1/accounts/qa-1b2c096047bb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f795ba7-dcaf-4fd8-b3dd-2ae910d4f8ec","handle":"qa-1b2c096047bb","displayName":"QA 1b2c096047bb","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.562087124Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-cd0abc69-2ad2-4fbe-ae51-3f9e5e8568d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd0abc69-2ad2-4fbe-ae51-3f9e5e8568d7
Content-Type: application/json

--- request body ---
{"handle":"qa-f7d53dd6ee59","password":"****"}

--- response: 200 in 31 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd0abc69-2ad2-4fbe-ae51-3f9e5e8568d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c7064a82-eb45-47e7-acc6-b51a334d663a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4255ee4b-3eb6-4393-8ab2-bf3087605942

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4255ee4b-3eb6-4393-8ab2-bf3087605942
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1b2c096047bb","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-4255ee4b-3eb6-4393-8ab2-bf3087605942
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
Location: /v1/conversations/cnv_342cccd0-15e1-4e78-a28f-5f620cdfe5ff
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_342cccd0-15e1-4e78-a28f-5f620cdfe5ff","subject":"Error contract","status":"open","region":"eu","participants":["qa-f7d53dd6ee59","qa-1b2c096047bb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:42.615377322Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-0dea403c-8574-4c9c-9799-504966eb4cfb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dea403c-8574-4c9c-9799-504966eb4cfb
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 26 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-0dea403c-8574-4c9c-9799-504966eb4cfb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7483a642-60d4-4724-b1fa-99c1ea78aae7"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-60fd6aec-9569-4eab-a527-d9071f62314a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60fd6aec-9569-4eab-a527-d9071f62314a
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-60fd6aec-9569-4eab-a527-d9071f62314a
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

{"accounts":9,"conversations":2,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-4d0a06b5-48fa-4da4-8530-4f505c9d3226

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d0a06b5-48fa-4da4-8530-4f505c9d3226
Content-Type: application/json

--- request body ---
{"handle":"qa-1b2c096047bb","password":"****"}

--- response: 200 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d0a06b5-48fa-4da4-8530-4f505c9d3226
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3f795ba7-dcaf-4fd8-b3dd-2ae910d4f8ec"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-449b1d51-b028-42c7-98d5-8020edc99407

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-449b1d51-b028-42c7-98d5-8020edc99407
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-449b1d51-b028-42c7-98d5-8020edc99407
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
correlation: qa-82ff5873-f670-4047-971e-f90d840b31d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82ff5873-f670-4047-971e-f90d840b31d1
Content-Type: application/json

--- request body ---
{"handle":"qa-1b2c096047bb","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-82ff5873-f670-4047-971e-f90d840b31d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-82ff5873-f670-4047-971e-f90d840b31d1"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-edd38354-a2b0-49d2-aeac-b7fcd6c97971

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edd38354-a2b0-49d2-aeac-b7fcd6c97971
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-edd38354-a2b0-49d2-aeac-b7fcd6c97971
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
correlation: qa-e5f56852-6899-4590-be26-3dcaf4768c3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5f56852-6899-4590-be26-3dcaf4768c3a
Content-Type: application/json

--- request body ---
{"handle":"qa-f7d53dd6ee59","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e5f56852-6899-4590-be26-3dcaf4768c3a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e5f56852-6899-4590-be26-3dcaf4768c3a"}
```

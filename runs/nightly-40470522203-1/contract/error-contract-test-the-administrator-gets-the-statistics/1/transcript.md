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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-9a88b81b-24c1-4d7f-b592-c420d8eac961` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-4a994bb5-8f5e-4079-afaf-5098d33a912f` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-239032e3-6d46-4016-9b45-69e91c2851d9` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-56cff46f-b9ba-450a-94b7-a445de2491fc` |
| 5 | `POST /v1/auth/token` | 200 | 18 | `qa-e1849ff6-0476-462c-b709-de0679d3822e` |
| 6 | `GET /v1/admin/stats` | 200 | 17 | `qa-acffeac0-3735-4f44-95b6-1bb889cff3fd` |
| 7 | `POST /v1/auth/token` | 200 | 10 | `qa-88e1c395-dbc7-4022-8f2d-1327b6c93c40` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-a0694730-e05b-4a17-bb39-7cfae8fd5783` |
| 9 | `POST /v1/auth/token` | 401 | 26 | `qa-d2d3fed0-06e6-482d-9ba8-287cca57369d` |
| 10 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-3d145eff-b1ef-43be-b4b3-088879798840` |
| 11 | `POST /v1/auth/token` | 401 | 14 | `qa-c54dbb4b-4071-4d3b-b6e5-4bb97d3a8d34` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9a88b81b-24c1-4d7f-b592-c420d8eac961

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a88b81b-24c1-4d7f-b592-c420d8eac961
Content-Type: application/json

--- request body ---
{"handle":"qa-6ced345b23b0","displayName":"QA 6ced345b23b0","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a88b81b-24c1-4d7f-b592-c420d8eac961
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 6
Location: /v1/accounts/qa-6ced345b23b0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_846fd6bc-1229-4112-8db0-a27b880c9fdf","handle":"qa-6ced345b23b0","displayName":"QA 6ced345b23b0","region":"eu","role":"user","createdAt":"2026-10-27T08:00:36.047344003Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4a994bb5-8f5e-4079-afaf-5098d33a912f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a994bb5-8f5e-4079-afaf-5098d33a912f
Content-Type: application/json

--- request body ---
{"handle":"qa-d55013231202","displayName":"QA d55013231202","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a994bb5-8f5e-4079-afaf-5098d33a912f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 6
Location: /v1/accounts/qa-d55013231202
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cbc411bd-fe37-43c6-ac86-dcb8f2ce8bf9","handle":"qa-d55013231202","displayName":"QA d55013231202","region":"eu","role":"user","createdAt":"2026-10-27T08:00:36.073142305Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-239032e3-6d46-4016-9b45-69e91c2851d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-239032e3-6d46-4016-9b45-69e91c2851d9
Content-Type: application/json

--- request body ---
{"handle":"qa-6ced345b23b0","password":"****"}

--- response: 200 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-239032e3-6d46-4016-9b45-69e91c2851d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_846fd6bc-1229-4112-8db0-a27b880c9fdf"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-56cff46f-b9ba-450a-94b7-a445de2491fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56cff46f-b9ba-450a-94b7-a445de2491fc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d55013231202","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-56cff46f-b9ba-450a-94b7-a445de2491fc
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
Location: /v1/conversations/cnv_f7d56c4c-2e8c-4d80-93d2-57fca1336060
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f7d56c4c-2e8c-4d80-93d2-57fca1336060","subject":"Error contract","status":"open","region":"eu","participants":["qa-6ced345b23b0","qa-d55013231202"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:36.119576795Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-e1849ff6-0476-462c-b709-de0679d3822e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1849ff6-0476-462c-b709-de0679d3822e
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1849ff6-0476-462c-b709-de0679d3822e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_48aee48e-b425-4d4a-8174-9bdeab2b6eb9"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-acffeac0-3735-4f44-95b6-1bb889cff3fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-acffeac0-3735-4f44-95b6-1bb889cff3fd
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-acffeac0-3735-4f44-95b6-1bb889cff3fd
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

{"accounts":6,"conversations":2,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-88e1c395-dbc7-4022-8f2d-1327b6c93c40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88e1c395-dbc7-4022-8f2d-1327b6c93c40
Content-Type: application/json

--- request body ---
{"handle":"qa-d55013231202","password":"****"}

--- response: 200 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-88e1c395-dbc7-4022-8f2d-1327b6c93c40
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cbc411bd-fe37-43c6-ac86-dcb8f2ce8bf9"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a0694730-e05b-4a17-bb39-7cfae8fd5783

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0694730-e05b-4a17-bb39-7cfae8fd5783
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a0694730-e05b-4a17-bb39-7cfae8fd5783
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
correlation: qa-d2d3fed0-06e6-482d-9ba8-287cca57369d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2d3fed0-06e6-482d-9ba8-287cca57369d
Content-Type: application/json

--- request body ---
{"handle":"qa-d55013231202","password":"****"}

--- response: 401 in 26 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d2d3fed0-06e6-482d-9ba8-287cca57369d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d2d3fed0-06e6-482d-9ba8-287cca57369d"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3d145eff-b1ef-43be-b4b3-088879798840

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d145eff-b1ef-43be-b4b3-088879798840
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3d145eff-b1ef-43be-b4b3-088879798840
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
correlation: qa-c54dbb4b-4071-4d3b-b6e5-4bb97d3a8d34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c54dbb4b-4071-4d3b-b6e5-4bb97d3a8d34
Content-Type: application/json

--- request body ---
{"handle":"qa-6ced345b23b0","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c54dbb4b-4071-4d3b-b6e5-4bb97d3a8d34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c54dbb4b-4071-4d3b-b6e5-4bb97d3a8d34"}
```

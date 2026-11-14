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
| 1 | `POST /v1/accounts` | 201 | 5 | `qa-921baef4-b8c0-4e22-abb5-c9d8f7d8cce6` |
| 2 | `POST /v1/accounts` | 201 | 9 | `qa-a838853c-8752-4f70-ab48-71cf215da35f` |
| 3 | `POST /v1/auth/token` | 200 | 5 | `qa-0471685c-43db-4ca9-b704-722e5c37ae5c` |
| 4 | `POST /v1/conversations` | 201 | 5 | `qa-7069a6cc-f596-46a5-845f-ef279fbfe7ba` |
| 5 | `POST /v1/auth/token` | 200 | 8 | `qa-54eda329-707b-4371-bd37-3e7f659687ac` |
| 6 | `GET /v1/admin/stats` | 200 | 24 | `qa-3336d6dd-0d3a-46e1-a42d-6018db5d646d` |
| 7 | `POST /v1/auth/token` | 200 | 16 | `qa-adca6901-f3c9-46df-8a90-14f77e135c69` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-56b295c5-3161-4b7c-8da1-73be2a460cc0` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-5a79116a-8893-4424-9274-f9913cf52dd9` |
| 10 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-94f04d5f-616b-42a8-b61c-1878467a67b4` |
| 11 | `POST /v1/auth/token` | 401 | 14 | `qa-98e39070-9f45-45a0-a117-b5f47819a62b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-921baef4-b8c0-4e22-abb5-c9d8f7d8cce6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-921baef4-b8c0-4e22-abb5-c9d8f7d8cce6
Content-Type: application/json

--- request body ---
{"handle":"qa-e17fb895903c","displayName":"QA e17fb895903c","password":"****","region":"eu"}

--- response: 201 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-921baef4-b8c0-4e22-abb5-c9d8f7d8cce6
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
Location: /v1/accounts/qa-e17fb895903c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8ef4477a-f141-4f1b-8f72-27d44a3cae97","handle":"qa-e17fb895903c","displayName":"QA e17fb895903c","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.842594069Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a838853c-8752-4f70-ab48-71cf215da35f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a838853c-8752-4f70-ab48-71cf215da35f
Content-Type: application/json

--- request body ---
{"handle":"qa-447843625792","displayName":"QA 447843625792","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-a838853c-8752-4f70-ab48-71cf215da35f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 7
Location: /v1/accounts/qa-447843625792
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ae5e7640-fdeb-45c9-85b4-629aaa0b740a","handle":"qa-447843625792","displayName":"QA 447843625792","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.854895304Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0471685c-43db-4ca9-b704-722e5c37ae5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0471685c-43db-4ca9-b704-722e5c37ae5c
Content-Type: application/json

--- request body ---
{"handle":"qa-e17fb895903c","password":"****"}

--- response: 200 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-0471685c-43db-4ca9-b704-722e5c37ae5c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8ef4477a-f141-4f1b-8f72-27d44a3cae97"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7069a6cc-f596-46a5-845f-ef279fbfe7ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7069a6cc-f596-46a5-845f-ef279fbfe7ba
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-447843625792","subject":"Error contract","message":"Hi"}

--- response: 201 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-7069a6cc-f596-46a5-845f-ef279fbfe7ba
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
Location: /v1/conversations/cnv_12429cef-c267-48ca-8abd-bf318fdd516c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_12429cef-c267-48ca-8abd-bf318fdd516c","subject":"Error contract","status":"open","region":"eu","participants":["qa-e17fb895903c","qa-447843625792"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:37.872368189Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-54eda329-707b-4371-bd37-3e7f659687ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54eda329-707b-4371-bd37-3e7f659687ac
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-54eda329-707b-4371-bd37-3e7f659687ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_67e1e294-3887-4624-adeb-43fd2fa49906"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-3336d6dd-0d3a-46e1-a42d-6018db5d646d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3336d6dd-0d3a-46e1-a42d-6018db5d646d
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-3336d6dd-0d3a-46e1-a42d-6018db5d646d
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

{"accounts":7,"conversations":2,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-adca6901-f3c9-46df-8a90-14f77e135c69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adca6901-f3c9-46df-8a90-14f77e135c69
Content-Type: application/json

--- request body ---
{"handle":"qa-447843625792","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-adca6901-f3c9-46df-8a90-14f77e135c69
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ae5e7640-fdeb-45c9-85b4-629aaa0b740a"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-56b295c5-3161-4b7c-8da1-73be2a460cc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56b295c5-3161-4b7c-8da1-73be2a460cc0
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-56b295c5-3161-4b7c-8da1-73be2a460cc0
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
correlation: qa-5a79116a-8893-4424-9274-f9913cf52dd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a79116a-8893-4424-9274-f9913cf52dd9
Content-Type: application/json

--- request body ---
{"handle":"qa-447843625792","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5a79116a-8893-4424-9274-f9913cf52dd9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5a79116a-8893-4424-9274-f9913cf52dd9"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-94f04d5f-616b-42a8-b61c-1878467a67b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94f04d5f-616b-42a8-b61c-1878467a67b4
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-94f04d5f-616b-42a8-b61c-1878467a67b4
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
correlation: qa-98e39070-9f45-45a0-a117-b5f47819a62b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98e39070-9f45-45a0-a117-b5f47819a62b
Content-Type: application/json

--- request body ---
{"handle":"qa-e17fb895903c","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-98e39070-9f45-45a0-a117-b5f47819a62b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-98e39070-9f45-45a0-a117-b5f47819a62b"}
```

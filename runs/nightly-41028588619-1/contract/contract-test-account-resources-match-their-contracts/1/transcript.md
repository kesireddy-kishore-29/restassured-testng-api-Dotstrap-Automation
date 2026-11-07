# Transcript: Account, token and public profile match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#accountResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01, FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 373 | `qa-7d36f4c6-31c9-484a-b994-fa96be5da0fb` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-d3601f52-8a43-4ef7-825e-cfe41a290645` |
| 3 | `POST /v1/auth/token` | 200 | 40 | `qa-1027ba32-4213-419b-b576-53273119c2c5` |
| 4 | `POST /v1/auth/token` | 200 | 19 | `qa-22550985-51b4-44a8-af67-abc60b4d3025` |
| 5 | `GET /v1/accounts/me` | 200 | 40 | `qa-68b13388-3fb1-416f-934c-9f09cc4172b1` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 39 | `qa-43b3e826-57ad-4c69-a240-04f34fc89559` |
| 7 | `POST /v1/auth/token` | 200 | 20 | `qa-98a3aabf-b961-4a9b-ab8a-24639f5b1343` |
| 8 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-fdc95410-5560-450f-a1a0-05eeea14d343` |
| 9 | `POST /v1/auth/token` | 401 | 8 | `qa-c99282ea-4dd8-4f35-99e4-2603c6008d31` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-dbcf1f9c-9db6-45ab-96f0-57408c8af9fc` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-286b58f9-670d-4048-adaf-09ed8086ec9f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7d36f4c6-31c9-484a-b994-fa96be5da0fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d36f4c6-31c9-484a-b994-fa96be5da0fb
Content-Type: application/json

--- request body ---
{"handle":"qa-b369c4e0c0e7","displayName":"QA b369c4e0c0e7","password":"****","region":"eu"}

--- response: 201 in 373 ms ---
Date: Fri, 30 Oct 2026 08:45:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d36f4c6-31c9-484a-b994-fa96be5da0fb
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
Location: /v1/accounts/qa-b369c4e0c0e7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d855aa57-b25d-48bb-81a1-3bbf7d69e66b","handle":"qa-b369c4e0c0e7","displayName":"QA b369c4e0c0e7","region":"eu","role":"user","createdAt":"2026-10-30T08:45:58.320592859Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d3601f52-8a43-4ef7-825e-cfe41a290645

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3601f52-8a43-4ef7-825e-cfe41a290645
Content-Type: application/json

--- request body ---
{"handle":"qa-d772dd97af86","displayName":"QA d772dd97af86","password":"****","region":"us"}

--- response: 201 in 37 ms ---
Date: Fri, 30 Oct 2026 08:45:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3601f52-8a43-4ef7-825e-cfe41a290645
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
Location: /v1/accounts/qa-d772dd97af86
X-Served-Region: us
Content-Length: 181

{"id":"acc_7134be42-8217-4ba0-9c44-19dc39c80bb5","handle":"qa-d772dd97af86","displayName":"QA d772dd97af86","region":"us","role":"user","createdAt":"2026-10-30T08:45:58.763666208Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1027ba32-4213-419b-b576-53273119c2c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1027ba32-4213-419b-b576-53273119c2c5
Content-Type: application/json

--- request body ---
{"handle":"qa-b369c4e0c0e7","password":"****"}

--- response: 200 in 40 ms ---
Date: Fri, 30 Oct 2026 08:45:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-1027ba32-4213-419b-b576-53273119c2c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d855aa57-b25d-48bb-81a1-3bbf7d69e66b"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-22550985-51b4-44a8-af67-abc60b4d3025

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22550985-51b4-44a8-af67-abc60b4d3025
Content-Type: application/json

--- request body ---
{"handle":"qa-b369c4e0c0e7","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 30 Oct 2026 08:45:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-22550985-51b4-44a8-af67-abc60b4d3025
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d855aa57-b25d-48bb-81a1-3bbf7d69e66b"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-68b13388-3fb1-416f-934c-9f09cc4172b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68b13388-3fb1-416f-934c-9f09cc4172b1
Content-Type: application/json

--- response: 200 in 40 ms ---
Date: Fri, 30 Oct 2026 08:45:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-68b13388-3fb1-416f-934c-9f09cc4172b1
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

{"id":"acc_d855aa57-b25d-48bb-81a1-3bbf7d69e66b","handle":"qa-b369c4e0c0e7","displayName":"QA b369c4e0c0e7","region":"eu","role":"user","createdAt":"2026-10-30T08:45:58.320592859Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-d772dd97af86
correlation: qa-43b3e826-57ad-4c69-a240-04f34fc89559

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43b3e826-57ad-4c69-a240-04f34fc89559
Content-Type: application/json

--- response: 200 in 39 ms ---
Date: Fri, 30 Oct 2026 08:45:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-43b3e826-57ad-4c69-a240-04f34fc89559
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
Content-Length: 74

{"handle":"qa-d772dd97af86","displayName":"QA d772dd97af86","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-98a3aabf-b961-4a9b-ab8a-24639f5b1343

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98a3aabf-b961-4a9b-ab8a-24639f5b1343
Content-Type: application/json

--- request body ---
{"handle":"qa-d772dd97af86","password":"****"}

--- response: 200 in 20 ms ---
Date: Fri, 30 Oct 2026 08:45:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-98a3aabf-b961-4a9b-ab8a-24639f5b1343
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7134be42-8217-4ba0-9c44-19dc39c80bb5"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fdc95410-5560-450f-a1a0-05eeea14d343

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdc95410-5560-450f-a1a0-05eeea14d343
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 30 Oct 2026 08:45:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fdc95410-5560-450f-a1a0-05eeea14d343
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
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-c99282ea-4dd8-4f35-99e4-2603c6008d31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c99282ea-4dd8-4f35-99e4-2603c6008d31
Content-Type: application/json

--- request body ---
{"handle":"qa-d772dd97af86","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 30 Oct 2026 08:45:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c99282ea-4dd8-4f35-99e4-2603c6008d31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c99282ea-4dd8-4f35-99e4-2603c6008d31"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dbcf1f9c-9db6-45ab-96f0-57408c8af9fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbcf1f9c-9db6-45ab-96f0-57408c8af9fc
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 30 Oct 2026 08:45:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dbcf1f9c-9db6-45ab-96f0-57408c8af9fc
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-286b58f9-670d-4048-adaf-09ed8086ec9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-286b58f9-670d-4048-adaf-09ed8086ec9f
Content-Type: application/json

--- request body ---
{"handle":"qa-b369c4e0c0e7","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 30 Oct 2026 08:45:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-286b58f9-670d-4048-adaf-09ed8086ec9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-286b58f9-670d-4048-adaf-09ed8086ec9f"}
```

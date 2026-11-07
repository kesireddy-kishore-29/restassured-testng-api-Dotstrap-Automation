# Transcript: Anyone signed in sees a public profile with no private fields

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#publicProfileExposesNoPrivateFields` |
| Features | FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 440 | `qa-2888ace5-c95d-423b-959d-a524dbc36095` |
| 2 | `POST /v1/accounts` | 201 | 57 | `qa-3ce2360c-a566-4a7e-9fd5-3df0591af25d` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-3a0b025c-90f2-41bc-81bd-4c7ba5dea641` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 46 | `qa-4cda905a-8e67-46c7-943f-3900f6e2b9b4` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 18 | `qa-b03c17f9-46db-4941-be6f-aa64e79a6bed` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 19 | `qa-cafb5282-1688-4d60-a759-4a35e108e474` |
| 7 | `POST /v1/auth/token` | 200 | 29 | `qa-fbeea80d-2c3d-4ba2-af48-dcd2a1903ebf` |
| 8 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-842b2548-14fc-4e7c-9f20-d7a654133b52` |
| 9 | `POST /v1/auth/token` | 401 | 14 | `qa-50e32cfc-77fa-48c7-9bbb-262fc6c96f55` |
| 10 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-07476899-5bcf-4d17-a75b-e789642e3c70` |
| 11 | `POST /v1/auth/token` | 401 | 13 | `qa-0ac419da-b23c-48d2-affa-450817b3dc6b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2888ace5-c95d-423b-959d-a524dbc36095

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2888ace5-c95d-423b-959d-a524dbc36095
Content-Type: application/json

--- request body ---
{"handle":"qa-de05b8024955","displayName":"QA de05b8024955","password":"****","region":"eu"}

--- response: 201 in 440 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-2888ace5-c95d-423b-959d-a524dbc36095
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
Location: /v1/accounts/qa-de05b8024955
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d2937949-8935-4f98-a9b4-bbe81360d448","handle":"qa-de05b8024955","displayName":"QA de05b8024955","region":"eu","role":"user","createdAt":"2026-11-01T09:23:24.291506918Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3ce2360c-a566-4a7e-9fd5-3df0591af25d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ce2360c-a566-4a7e-9fd5-3df0591af25d
Content-Type: application/json

--- request body ---
{"handle":"qa-84e8f3dd9c43","displayName":"QA 84e8f3dd9c43","password":"****","region":"us"}

--- response: 201 in 57 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ce2360c-a566-4a7e-9fd5-3df0591af25d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-84e8f3dd9c43
X-Served-Region: us
Content-Length: 181

{"id":"acc_f5c34128-f50a-466a-b18e-2e20c6910582","handle":"qa-84e8f3dd9c43","displayName":"QA 84e8f3dd9c43","region":"us","role":"user","createdAt":"2026-11-01T09:23:24.739159098Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3a0b025c-90f2-41bc-81bd-4c7ba5dea641

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a0b025c-90f2-41bc-81bd-4c7ba5dea641
Content-Type: application/json

--- request body ---
{"handle":"qa-de05b8024955","password":"****"}

--- response: 200 in 25 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a0b025c-90f2-41bc-81bd-4c7ba5dea641
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d2937949-8935-4f98-a9b4-bbe81360d448"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-84e8f3dd9c43
correlation: qa-4cda905a-8e67-46c7-943f-3900f6e2b9b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cda905a-8e67-46c7-943f-3900f6e2b9b4
Content-Type: application/json

--- response: 200 in 46 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cda905a-8e67-46c7-943f-3900f6e2b9b4
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
Content-Length: 74

{"handle":"qa-84e8f3dd9c43","displayName":"QA 84e8f3dd9c43","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-84e8f3dd9c43
correlation: qa-b03c17f9-46db-4941-be6f-aa64e79a6bed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b03c17f9-46db-4941-be6f-aa64e79a6bed
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-b03c17f9-46db-4941-be6f-aa64e79a6bed
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

{"handle":"qa-84e8f3dd9c43","displayName":"QA 84e8f3dd9c43","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-84e8f3dd9c43
correlation: qa-cafb5282-1688-4d60-a759-4a35e108e474

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cafb5282-1688-4d60-a759-4a35e108e474
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-cafb5282-1688-4d60-a759-4a35e108e474
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

{"handle":"qa-84e8f3dd9c43","displayName":"QA 84e8f3dd9c43","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-fbeea80d-2c3d-4ba2-af48-dcd2a1903ebf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbeea80d-2c3d-4ba2-af48-dcd2a1903ebf
Content-Type: application/json

--- request body ---
{"handle":"qa-84e8f3dd9c43","password":"****"}

--- response: 200 in 29 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-fbeea80d-2c3d-4ba2-af48-dcd2a1903ebf
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f5c34128-f50a-466a-b18e-2e20c6910582"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-842b2548-14fc-4e7c-9f20-d7a654133b52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-842b2548-14fc-4e7c-9f20-d7a654133b52
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-842b2548-14fc-4e7c-9f20-d7a654133b52
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
correlation: qa-50e32cfc-77fa-48c7-9bbb-262fc6c96f55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50e32cfc-77fa-48c7-9bbb-262fc6c96f55
Content-Type: application/json

--- request body ---
{"handle":"qa-84e8f3dd9c43","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-50e32cfc-77fa-48c7-9bbb-262fc6c96f55
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-50e32cfc-77fa-48c7-9bbb-262fc6c96f55"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-07476899-5bcf-4d17-a75b-e789642e3c70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07476899-5bcf-4d17-a75b-e789642e3c70
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-07476899-5bcf-4d17-a75b-e789642e3c70
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
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-0ac419da-b23c-48d2-affa-450817b3dc6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ac419da-b23c-48d2-affa-450817b3dc6b
Content-Type: application/json

--- request body ---
{"handle":"qa-de05b8024955","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0ac419da-b23c-48d2-affa-450817b3dc6b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0ac419da-b23c-48d2-affa-450817b3dc6b"}
```

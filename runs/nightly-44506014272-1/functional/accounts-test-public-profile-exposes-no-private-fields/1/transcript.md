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
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-5b90bb98-7f49-494e-a602-69119ac6a56e` |
| 2 | `POST /v1/accounts` | 201 | 10 | `qa-d1146861-638f-4411-afbc-e587159d3b09` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-639e3d27-d290-4379-81fc-2beed6c0d2da` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 11 | `qa-e8238ba5-4b59-4b62-a61f-d09a8112b683` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 6 | `qa-66519d17-e679-4ee6-b522-209353729594` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 6 | `qa-85fda9f0-dd44-4c99-8cc6-f5231a40f29e` |
| 7 | `POST /v1/auth/token` | 200 | 12 | `qa-4ccbdae4-adc4-43fe-bc0d-2bd0b8bf220a` |
| 8 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-fa5f1100-173f-4d4b-8f16-66dd267fcdaf` |
| 9 | `POST /v1/auth/token` | 401 | 13 | `qa-c405133a-11d9-44c9-a751-17412f11bfb4` |
| 10 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-2ee408ca-05cb-40af-b6bf-1c81278f703b` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-ddbd5057-2a95-4fe4-a0fd-dee5d36bd4a5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5b90bb98-7f49-494e-a602-69119ac6a56e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b90bb98-7f49-494e-a602-69119ac6a56e
Content-Type: application/json

--- request body ---
{"handle":"qa-511ffe9cbba7","displayName":"QA 511ffe9cbba7","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b90bb98-7f49-494e-a602-69119ac6a56e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Location: /v1/accounts/qa-511ffe9cbba7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_37e526bb-3de8-4c02-a32a-f38ae7a5798a","handle":"qa-511ffe9cbba7","displayName":"QA 511ffe9cbba7","region":"eu","role":"user","createdAt":"2026-11-19T10:29:15.934199816Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d1146861-638f-4411-afbc-e587159d3b09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1146861-638f-4411-afbc-e587159d3b09
Content-Type: application/json

--- request body ---
{"handle":"qa-0bd16cab673b","displayName":"QA 0bd16cab673b","password":"****","region":"us"}

--- response: 201 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1146861-638f-4411-afbc-e587159d3b09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-0bd16cab673b
X-Served-Region: us
Content-Length: 181

{"id":"acc_f97a39f2-ae31-498a-8ffd-5f91e271bc20","handle":"qa-0bd16cab673b","displayName":"QA 0bd16cab673b","region":"us","role":"user","createdAt":"2026-11-19T10:29:15.957672409Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-639e3d27-d290-4379-81fc-2beed6c0d2da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-639e3d27-d290-4379-81fc-2beed6c0d2da
Content-Type: application/json

--- request body ---
{"handle":"qa-511ffe9cbba7","password":"****"}

--- response: 200 in 16 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-639e3d27-d290-4379-81fc-2beed6c0d2da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_37e526bb-3de8-4c02-a32a-f38ae7a5798a"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-0bd16cab673b
correlation: qa-e8238ba5-4b59-4b62-a61f-d09a8112b683

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8238ba5-4b59-4b62-a61f-d09a8112b683
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 19 Nov 2026 10:29:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8238ba5-4b59-4b62-a61f-d09a8112b683
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

{"handle":"qa-0bd16cab673b","displayName":"QA 0bd16cab673b","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-0bd16cab673b
correlation: qa-66519d17-e679-4ee6-b522-209353729594

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66519d17-e679-4ee6-b522-209353729594
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-66519d17-e679-4ee6-b522-209353729594
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

{"handle":"qa-0bd16cab673b","displayName":"QA 0bd16cab673b","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-0bd16cab673b
correlation: qa-85fda9f0-dd44-4c99-8cc6-f5231a40f29e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85fda9f0-dd44-4c99-8cc6-f5231a40f29e
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-85fda9f0-dd44-4c99-8cc6-f5231a40f29e
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

{"handle":"qa-0bd16cab673b","displayName":"QA 0bd16cab673b","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-4ccbdae4-adc4-43fe-bc0d-2bd0b8bf220a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ccbdae4-adc4-43fe-bc0d-2bd0b8bf220a
Content-Type: application/json

--- request body ---
{"handle":"qa-0bd16cab673b","password":"****"}

--- response: 200 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ccbdae4-adc4-43fe-bc0d-2bd0b8bf220a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f97a39f2-ae31-498a-8ffd-5f91e271bc20"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fa5f1100-173f-4d4b-8f16-66dd267fcdaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa5f1100-173f-4d4b-8f16-66dd267fcdaf
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fa5f1100-173f-4d4b-8f16-66dd267fcdaf
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
correlation: qa-c405133a-11d9-44c9-a751-17412f11bfb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c405133a-11d9-44c9-a751-17412f11bfb4
Content-Type: application/json

--- request body ---
{"handle":"qa-0bd16cab673b","password":"****"}

--- response: 401 in 13 ms ---
Date: Thu, 19 Nov 2026 10:29:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c405133a-11d9-44c9-a751-17412f11bfb4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c405133a-11d9-44c9-a751-17412f11bfb4"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2ee408ca-05cb-40af-b6bf-1c81278f703b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ee408ca-05cb-40af-b6bf-1c81278f703b
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 19 Nov 2026 10:29:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2ee408ca-05cb-40af-b6bf-1c81278f703b
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
correlation: qa-ddbd5057-2a95-4fe4-a0fd-dee5d36bd4a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddbd5057-2a95-4fe4-a0fd-dee5d36bd4a5
Content-Type: application/json

--- request body ---
{"handle":"qa-511ffe9cbba7","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ddbd5057-2a95-4fe4-a0fd-dee5d36bd4a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ddbd5057-2a95-4fe4-a0fd-dee5d36bd4a5"}
```

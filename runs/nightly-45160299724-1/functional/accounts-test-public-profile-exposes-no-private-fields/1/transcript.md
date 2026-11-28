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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-af7466a6-beb1-468d-8b3d-860bada6e48d` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-af5869e5-034e-4631-8b30-0be074d4dcb6` |
| 3 | `POST /v1/auth/token` | 200 | 13 | `qa-dbd17316-adf9-4a9c-81d5-6fb9f2491f64` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 14 | `qa-ca4cff9d-cd7c-45dd-9c85-f9b38ac093eb` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 9 | `qa-05ce872d-45b8-4f4f-b9d5-907a9bfb5c77` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 10 | `qa-50195f38-d576-44ad-88ec-56917bfc37b7` |
| 7 | `POST /v1/auth/token` | 200 | 10 | `qa-903654ff-8530-4fa7-97f3-960154a2efc1` |
| 8 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-322d1789-0cf8-4b63-a78a-73a0e6a1557e` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-1d9614e8-bb4c-4265-94a5-198f4c9bb9aa` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-5bde4982-d743-4d2b-a5c4-bf4905a2d5a9` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-025fb6de-a4d2-4a09-b81e-d74c80e91ce4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-af7466a6-beb1-468d-8b3d-860bada6e48d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af7466a6-beb1-468d-8b3d-860bada6e48d
Content-Type: application/json

--- request body ---
{"handle":"qa-e5c7110176ee","displayName":"QA e5c7110176ee","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-af7466a6-beb1-468d-8b3d-860bada6e48d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-e5c7110176ee
X-Served-Region: eu
Content-Length: 181

{"id":"acc_873954c8-a3c9-46fc-95e3-df84002d60c0","handle":"qa-e5c7110176ee","displayName":"QA e5c7110176ee","region":"eu","role":"user","createdAt":"2026-11-23T10:55:03.395704138Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-af5869e5-034e-4631-8b30-0be074d4dcb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af5869e5-034e-4631-8b30-0be074d4dcb6
Content-Type: application/json

--- request body ---
{"handle":"qa-31e46e07c21b","displayName":"QA 31e46e07c21b","password":"****","region":"us"}

--- response: 201 in 17 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-af5869e5-034e-4631-8b30-0be074d4dcb6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-31e46e07c21b
X-Served-Region: us
Content-Length: 181

{"id":"acc_fdce0d7f-f1b2-442a-a324-d9bd6dfdd7f4","handle":"qa-31e46e07c21b","displayName":"QA 31e46e07c21b","region":"us","role":"user","createdAt":"2026-11-23T10:55:03.422145485Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dbd17316-adf9-4a9c-81d5-6fb9f2491f64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbd17316-adf9-4a9c-81d5-6fb9f2491f64
Content-Type: application/json

--- request body ---
{"handle":"qa-e5c7110176ee","password":"****"}

--- response: 200 in 13 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbd17316-adf9-4a9c-81d5-6fb9f2491f64
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_873954c8-a3c9-46fc-95e3-df84002d60c0"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-31e46e07c21b
correlation: qa-ca4cff9d-cd7c-45dd-9c85-f9b38ac093eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca4cff9d-cd7c-45dd-9c85-f9b38ac093eb
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca4cff9d-cd7c-45dd-9c85-f9b38ac093eb
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

{"handle":"qa-31e46e07c21b","displayName":"QA 31e46e07c21b","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-31e46e07c21b
correlation: qa-05ce872d-45b8-4f4f-b9d5-907a9bfb5c77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05ce872d-45b8-4f4f-b9d5-907a9bfb5c77
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-05ce872d-45b8-4f4f-b9d5-907a9bfb5c77
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

{"handle":"qa-31e46e07c21b","displayName":"QA 31e46e07c21b","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-31e46e07c21b
correlation: qa-50195f38-d576-44ad-88ec-56917bfc37b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50195f38-d576-44ad-88ec-56917bfc37b7
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-50195f38-d576-44ad-88ec-56917bfc37b7
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

{"handle":"qa-31e46e07c21b","displayName":"QA 31e46e07c21b","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-903654ff-8530-4fa7-97f3-960154a2efc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-903654ff-8530-4fa7-97f3-960154a2efc1
Content-Type: application/json

--- request body ---
{"handle":"qa-31e46e07c21b","password":"****"}

--- response: 200 in 10 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-903654ff-8530-4fa7-97f3-960154a2efc1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fdce0d7f-f1b2-442a-a324-d9bd6dfdd7f4"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-322d1789-0cf8-4b63-a78a-73a0e6a1557e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-322d1789-0cf8-4b63-a78a-73a0e6a1557e
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-322d1789-0cf8-4b63-a78a-73a0e6a1557e
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
correlation: qa-1d9614e8-bb4c-4265-94a5-198f4c9bb9aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d9614e8-bb4c-4265-94a5-198f4c9bb9aa
Content-Type: application/json

--- request body ---
{"handle":"qa-31e46e07c21b","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1d9614e8-bb4c-4265-94a5-198f4c9bb9aa
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1d9614e8-bb4c-4265-94a5-198f4c9bb9aa"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5bde4982-d743-4d2b-a5c4-bf4905a2d5a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bde4982-d743-4d2b-a5c4-bf4905a2d5a9
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5bde4982-d743-4d2b-a5c4-bf4905a2d5a9
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
correlation: qa-025fb6de-a4d2-4a09-b81e-d74c80e91ce4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-025fb6de-a4d2-4a09-b81e-d74c80e91ce4
Content-Type: application/json

--- request body ---
{"handle":"qa-e5c7110176ee","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-025fb6de-a4d2-4a09-b81e-d74c80e91ce4
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-025fb6de-a4d2-4a09-b81e-d74c80e91ce4"}
```

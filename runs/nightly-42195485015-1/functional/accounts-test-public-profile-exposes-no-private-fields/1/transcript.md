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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-16d2b43b-52e0-4afb-984b-13b9e0f079a8` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-654b340e-36fc-4328-89a3-96c050e5affe` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-de13fb84-959d-405a-8387-7cb0a191e44d` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 22 | `qa-b93ef2a1-a16d-4b24-a7ec-c7e96b46b379` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 11 | `qa-cc2c75f8-a82e-43d3-a443-7d71c00f26bb` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 17 | `qa-742e17df-9e1f-49f2-83f0-df7d234bb3ec` |
| 7 | `POST /v1/auth/token` | 200 | 37 | `qa-78b70b59-2e53-40d8-b2d0-58b18556c9be` |
| 8 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-4efd3dac-7857-42c9-9a6a-fd7eadc3d7af` |
| 9 | `POST /v1/auth/token` | 401 | 16 | `qa-05eed484-f542-4fa0-abdd-0783b6659af8` |
| 10 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-e3c626c3-6063-4c59-94ea-dba617c07caf` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-27e19090-4449-4aac-a2bd-416a132e7c17` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-16d2b43b-52e0-4afb-984b-13b9e0f079a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16d2b43b-52e0-4afb-984b-13b9e0f079a8
Content-Type: application/json

--- request body ---
{"handle":"qa-5be6e712c5ba","displayName":"QA 5be6e712c5ba","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-16d2b43b-52e0-4afb-984b-13b9e0f079a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Location: /v1/accounts/qa-5be6e712c5ba
X-Served-Region: eu
Content-Length: 181

{"id":"acc_062d3032-dbad-4677-bc21-24193b6c6db8","handle":"qa-5be6e712c5ba","displayName":"QA 5be6e712c5ba","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.212756547Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-654b340e-36fc-4328-89a3-96c050e5affe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-654b340e-36fc-4328-89a3-96c050e5affe
Content-Type: application/json

--- request body ---
{"handle":"qa-6ede4eb511a9","displayName":"QA 6ede4eb511a9","password":"****","region":"us"}

--- response: 201 in 29 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-654b340e-36fc-4328-89a3-96c050e5affe
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
Location: /v1/accounts/qa-6ede4eb511a9
X-Served-Region: us
Content-Length: 181

{"id":"acc_a518d1cd-dc04-488b-b14d-c8acf2994140","handle":"qa-6ede4eb511a9","displayName":"QA 6ede4eb511a9","region":"us","role":"user","createdAt":"2026-11-06T09:30:33.258090569Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-de13fb84-959d-405a-8387-7cb0a191e44d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de13fb84-959d-405a-8387-7cb0a191e44d
Content-Type: application/json

--- request body ---
{"handle":"qa-5be6e712c5ba","password":"****"}

--- response: 200 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-de13fb84-959d-405a-8387-7cb0a191e44d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_062d3032-dbad-4677-bc21-24193b6c6db8"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-6ede4eb511a9
correlation: qa-b93ef2a1-a16d-4b24-a7ec-c7e96b46b379

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b93ef2a1-a16d-4b24-a7ec-c7e96b46b379
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-b93ef2a1-a16d-4b24-a7ec-c7e96b46b379
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

{"handle":"qa-6ede4eb511a9","displayName":"QA 6ede4eb511a9","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-6ede4eb511a9
correlation: qa-cc2c75f8-a82e-43d3-a443-7d71c00f26bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc2c75f8-a82e-43d3-a443-7d71c00f26bb
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc2c75f8-a82e-43d3-a443-7d71c00f26bb
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

{"handle":"qa-6ede4eb511a9","displayName":"QA 6ede4eb511a9","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-6ede4eb511a9
correlation: qa-742e17df-9e1f-49f2-83f0-df7d234bb3ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-742e17df-9e1f-49f2-83f0-df7d234bb3ec
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-742e17df-9e1f-49f2-83f0-df7d234bb3ec
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

{"handle":"qa-6ede4eb511a9","displayName":"QA 6ede4eb511a9","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-78b70b59-2e53-40d8-b2d0-58b18556c9be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78b70b59-2e53-40d8-b2d0-58b18556c9be
Content-Type: application/json

--- request body ---
{"handle":"qa-6ede4eb511a9","password":"****"}

--- response: 200 in 37 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-78b70b59-2e53-40d8-b2d0-58b18556c9be
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a518d1cd-dc04-488b-b14d-c8acf2994140"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4efd3dac-7857-42c9-9a6a-fd7eadc3d7af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4efd3dac-7857-42c9-9a6a-fd7eadc3d7af
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4efd3dac-7857-42c9-9a6a-fd7eadc3d7af
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
correlation: qa-05eed484-f542-4fa0-abdd-0783b6659af8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05eed484-f542-4fa0-abdd-0783b6659af8
Content-Type: application/json

--- request body ---
{"handle":"qa-6ede4eb511a9","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-05eed484-f542-4fa0-abdd-0783b6659af8
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-05eed484-f542-4fa0-abdd-0783b6659af8"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e3c626c3-6063-4c59-94ea-dba617c07caf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3c626c3-6063-4c59-94ea-dba617c07caf
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e3c626c3-6063-4c59-94ea-dba617c07caf
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
correlation: qa-27e19090-4449-4aac-a2bd-416a132e7c17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27e19090-4449-4aac-a2bd-416a132e7c17
Content-Type: application/json

--- request body ---
{"handle":"qa-5be6e712c5ba","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27e19090-4449-4aac-a2bd-416a132e7c17
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-27e19090-4449-4aac-a2bd-416a132e7c17"}
```

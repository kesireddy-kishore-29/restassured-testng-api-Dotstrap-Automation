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
| 1 | `POST /v1/accounts` | 201 | 288 | `qa-424c0c32-70f9-4b49-b0e4-8fb03efdef25` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-1d89188d-7b92-49e4-ba4e-15a60226d7b3` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-d0468bc6-b3f9-4f65-87d9-494e43b6e9ef` |
| 4 | `POST /v1/auth/token` | 200 | 26 | `qa-2573b1b2-54e5-45ec-b2e0-63612812a5f2` |
| 5 | `GET /v1/accounts/me` | 200 | 30 | `qa-83619280-f85a-4d04-9e1d-d6d744bf5de8` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 22 | `qa-c8cc9f72-2e41-4db1-bc00-02764f099987` |
| 7 | `POST /v1/auth/token` | 200 | 25 | `qa-e2778bc0-6fc8-47b6-b080-c96af8c5f201` |
| 8 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-b6a54f30-ec39-41d3-b473-9c11999563ad` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-ea5d4a79-55df-4309-be8b-6b80ad1665c3` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-810fd231-c0fa-4282-b965-4995336b4fb2` |
| 11 | `POST /v1/auth/token` | 401 | 9 | `qa-f4595909-0f34-498c-b2ac-48b7ef9a6c74` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-424c0c32-70f9-4b49-b0e4-8fb03efdef25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-424c0c32-70f9-4b49-b0e4-8fb03efdef25
Content-Type: application/json

--- request body ---
{"handle":"qa-644eb7f2195a","displayName":"QA 644eb7f2195a","password":"****","region":"eu"}

--- response: 201 in 288 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-424c0c32-70f9-4b49-b0e4-8fb03efdef25
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
Location: /v1/accounts/qa-644eb7f2195a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_200c90ff-383d-4451-9c3b-3c67bf0f8da5","handle":"qa-644eb7f2195a","displayName":"QA 644eb7f2195a","region":"eu","role":"user","createdAt":"2026-11-20T10:10:05.389337825Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1d89188d-7b92-49e4-ba4e-15a60226d7b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d89188d-7b92-49e4-ba4e-15a60226d7b3
Content-Type: application/json

--- request body ---
{"handle":"qa-dcd5cbfb5fe6","displayName":"QA dcd5cbfb5fe6","password":"****","region":"us"}

--- response: 201 in 29 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d89188d-7b92-49e4-ba4e-15a60226d7b3
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
Location: /v1/accounts/qa-dcd5cbfb5fe6
X-Served-Region: us
Content-Length: 181

{"id":"acc_1fcd1f49-2611-47e4-ada5-99a644a37841","handle":"qa-dcd5cbfb5fe6","displayName":"QA dcd5cbfb5fe6","region":"us","role":"user","createdAt":"2026-11-20T10:10:05.679835056Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d0468bc6-b3f9-4f65-87d9-494e43b6e9ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0468bc6-b3f9-4f65-87d9-494e43b6e9ef
Content-Type: application/json

--- request body ---
{"handle":"qa-644eb7f2195a","password":"****"}

--- response: 200 in 39 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0468bc6-b3f9-4f65-87d9-494e43b6e9ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_200c90ff-383d-4451-9c3b-3c67bf0f8da5"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-2573b1b2-54e5-45ec-b2e0-63612812a5f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2573b1b2-54e5-45ec-b2e0-63612812a5f2
Content-Type: application/json

--- request body ---
{"handle":"qa-644eb7f2195a","password":"****"}

--- response: 200 in 26 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-2573b1b2-54e5-45ec-b2e0-63612812a5f2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_200c90ff-383d-4451-9c3b-3c67bf0f8da5"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-83619280-f85a-4d04-9e1d-d6d744bf5de8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83619280-f85a-4d04-9e1d-d6d744bf5de8
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-83619280-f85a-4d04-9e1d-d6d744bf5de8
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

{"id":"acc_200c90ff-383d-4451-9c3b-3c67bf0f8da5","handle":"qa-644eb7f2195a","displayName":"QA 644eb7f2195a","region":"eu","role":"user","createdAt":"2026-11-20T10:10:05.389337825Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-dcd5cbfb5fe6
correlation: qa-c8cc9f72-2e41-4db1-bc00-02764f099987

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8cc9f72-2e41-4db1-bc00-02764f099987
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8cc9f72-2e41-4db1-bc00-02764f099987
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

{"handle":"qa-dcd5cbfb5fe6","displayName":"QA dcd5cbfb5fe6","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-e2778bc0-6fc8-47b6-b080-c96af8c5f201

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2778bc0-6fc8-47b6-b080-c96af8c5f201
Content-Type: application/json

--- request body ---
{"handle":"qa-dcd5cbfb5fe6","password":"****"}

--- response: 200 in 25 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2778bc0-6fc8-47b6-b080-c96af8c5f201
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1fcd1f49-2611-47e4-ada5-99a644a37841"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b6a54f30-ec39-41d3-b473-9c11999563ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6a54f30-ec39-41d3-b473-9c11999563ad
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b6a54f30-ec39-41d3-b473-9c11999563ad
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
correlation: qa-ea5d4a79-55df-4309-be8b-6b80ad1665c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea5d4a79-55df-4309-be8b-6b80ad1665c3
Content-Type: application/json

--- request body ---
{"handle":"qa-dcd5cbfb5fe6","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ea5d4a79-55df-4309-be8b-6b80ad1665c3
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ea5d4a79-55df-4309-be8b-6b80ad1665c3"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-810fd231-c0fa-4282-b965-4995336b4fb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-810fd231-c0fa-4282-b965-4995336b4fb2
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-810fd231-c0fa-4282-b965-4995336b4fb2
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
correlation: qa-f4595909-0f34-498c-b2ac-48b7ef9a6c74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4595909-0f34-498c-b2ac-48b7ef9a6c74
Content-Type: application/json

--- request body ---
{"handle":"qa-644eb7f2195a","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f4595909-0f34-498c-b2ac-48b7ef9a6c74
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f4595909-0f34-498c-b2ac-48b7ef9a6c74"}
```

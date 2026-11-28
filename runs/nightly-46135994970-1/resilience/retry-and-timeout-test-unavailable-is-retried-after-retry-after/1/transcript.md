# Transcript: A 503 with Retry-After is retried after the wait

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.RetryAndTimeoutTest#unavailableIsRetriedAfterRetryAfter` |
| Features | FEAT-RES-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-72d37d3f-053b-4e85-9f30-0f759cc3f031` |
| 2 | `POST /v1/auth/token` | 200 | 22 | `qa-86a41455-a245-4a5b-9e0a-66c60470554e` |
| 3 | `GET /v1/accounts/me` | 503 | 10 | `qa-36bdff06-5b48-4105-9ecd-eed93d77c653` |
| 4 | `GET /v1/accounts/me` | 200 | 12 | `qa-8cbf01e7-5e6f-48a0-9e91-96a34ce02fa0` |
| 5 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-617d5ee3-24f3-434c-97d8-65ef8334aa5e` |
| 6 | `POST /v1/auth/token` | 401 | 5 | `qa-7a49ce9a-86ec-41ed-9cea-565f981fa484` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-72d37d3f-053b-4e85-9f30-0f759cc3f031

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72d37d3f-053b-4e85-9f30-0f759cc3f031
Content-Type: application/json

--- request body ---
{"handle":"qa-ca3d9a628555","displayName":"QA ca3d9a628555","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sat, 28 Nov 2026 10:37:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-72d37d3f-053b-4e85-9f30-0f759cc3f031
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
Location: /v1/accounts/qa-ca3d9a628555
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bfc5ce47-32f0-4210-886d-03bb0b5dc856","handle":"qa-ca3d9a628555","displayName":"QA ca3d9a628555","region":"eu","role":"user","createdAt":"2026-11-28T10:37:13.232362089Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-86a41455-a245-4a5b-9e0a-66c60470554e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86a41455-a245-4a5b-9e0a-66c60470554e
Content-Type: application/json

--- request body ---
{"handle":"qa-ca3d9a628555","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 28 Nov 2026 10:37:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-86a41455-a245-4a5b-9e0a-66c60470554e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bfc5ce47-32f0-4210-886d-03bb0b5dc856"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-36bdff06-5b48-4105-9ecd-eed93d77c653

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: a1daf606-c1a7-4d33-b563-e4f2334df844
X-Correlation-Id: qa-36bdff06-5b48-4105-9ecd-eed93d77c653
Content-Type: application/json

--- response: 503 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-36bdff06-5b48-4105-9ecd-eed93d77c653
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-36bdff06-5b48-4105-9ecd-eed93d77c653"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-8cbf01e7-5e6f-48a0-9e91-96a34ce02fa0

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: a1daf606-c1a7-4d33-b563-e4f2334df844
X-Correlation-Id: qa-8cbf01e7-5e6f-48a0-9e91-96a34ce02fa0
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cbf01e7-5e6f-48a0-9e91-96a34ce02fa0
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

{"id":"acc_bfc5ce47-32f0-4210-886d-03bb0b5dc856","handle":"qa-ca3d9a628555","displayName":"QA ca3d9a628555","region":"eu","role":"user","createdAt":"2026-11-28T10:37:13.232362089Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-617d5ee3-24f3-434c-97d8-65ef8334aa5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-617d5ee3-24f3-434c-97d8-65ef8334aa5e
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-617d5ee3-24f3-434c-97d8-65ef8334aa5e
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

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7a49ce9a-86ec-41ed-9cea-565f981fa484

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a49ce9a-86ec-41ed-9cea-565f981fa484
Content-Type: application/json

--- request body ---
{"handle":"qa-ca3d9a628555","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7a49ce9a-86ec-41ed-9cea-565f981fa484
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7a49ce9a-86ec-41ed-9cea-565f981fa484"}
```

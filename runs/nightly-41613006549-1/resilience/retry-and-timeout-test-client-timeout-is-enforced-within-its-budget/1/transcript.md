# Transcript: A slow server cannot hang the client

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.RetryAndTimeoutTest#clientTimeoutIsEnforcedWithinItsBudget` |
| Features | FEAT-RES-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 399 | `qa-12496cb6-c32f-497d-8e41-bc3115058fc7` |
| 2 | `POST /v1/auth/token` | 200 | 48 | `qa-9230bc5b-0717-4fd7-b09d-0989afa48709` |
| 3 | `GET /v1/accounts/me` | error | 851 | `qa-708f7011-76fa-4c85-adae-356182dd2307` |
| 4 | `GET /v1/accounts/me` | error | 822 | `qa-9f379334-40fb-4ff4-9fa7-049d7aa0015b` |
| 5 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-aca45dfc-5c7b-49ed-a50a-f47293cf53ba` |
| 6 | `POST /v1/auth/token` | 401 | 5 | `qa-9952ba18-b570-4172-aaaf-e01337c44f59` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-12496cb6-c32f-497d-8e41-bc3115058fc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12496cb6-c32f-497d-8e41-bc3115058fc7
Content-Type: application/json

--- request body ---
{"handle":"qa-4edafae82054","displayName":"QA 4edafae82054","password":"****","region":"eu"}

--- response: 201 in 399 ms ---
Date: Tue, 03 Nov 2026 09:41:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-12496cb6-c32f-497d-8e41-bc3115058fc7
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
Location: /v1/accounts/qa-4edafae82054
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b55c2c1-c817-46bd-9b10-5a2836281588","handle":"qa-4edafae82054","displayName":"QA 4edafae82054","region":"eu","role":"user","createdAt":"2026-11-03T09:41:38.395456414Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9230bc5b-0717-4fd7-b09d-0989afa48709

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9230bc5b-0717-4fd7-b09d-0989afa48709
Content-Type: application/json

--- request body ---
{"handle":"qa-4edafae82054","password":"****"}

--- response: 200 in 48 ms ---
Date: Tue, 03 Nov 2026 09:41:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-9230bc5b-0717-4fd7-b09d-0989afa48709
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b55c2c1-c817-46bd-9b10-5a2836281588"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-708f7011-76fa-4c85-adae-356182dd2307

--- request headers ---
Accept: application/json
X-Fault-Key: d9991beb-34a5-4a1c-ba7d-736ada2ad3cd
X-Fault: latency=4000
X-Correlation-Id: qa-708f7011-76fa-4c85-adae-356182dd2307
Content-Type: application/json

--- response: none in 851 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-9f379334-40fb-4ff4-9fa7-049d7aa0015b

--- request headers ---
Accept: application/json
X-Fault-Key: d9991beb-34a5-4a1c-ba7d-736ada2ad3cd
X-Fault: latency=4000
X-Correlation-Id: qa-9f379334-40fb-4ff4-9fa7-049d7aa0015b
Content-Type: application/json

--- response: none in 822 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aca45dfc-5c7b-49ed-a50a-f47293cf53ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aca45dfc-5c7b-49ed-a50a-f47293cf53ba
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:40 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aca45dfc-5c7b-49ed-a50a-f47293cf53ba
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

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9952ba18-b570-4172-aaaf-e01337c44f59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9952ba18-b570-4172-aaaf-e01337c44f59
Content-Type: application/json

--- request body ---
{"handle":"qa-4edafae82054","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9952ba18-b570-4172-aaaf-e01337c44f59
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9952ba18-b570-4172-aaaf-e01337c44f59"}
```

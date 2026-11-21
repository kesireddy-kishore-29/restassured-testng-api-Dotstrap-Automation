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
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-4b0ca33b-6672-4706-8fc1-d86bdb60c108` |
| 2 | `POST /v1/auth/token` | 200 | 20 | `qa-b603646c-608d-4734-9a53-4c14a808c23c` |
| 3 | `GET /v1/accounts/me` | 503 | 12 | `qa-798e5e83-6a8d-49bc-b751-e95f2ffc6926` |
| 4 | `GET /v1/accounts/me` | 200 | 6 | `qa-212958d9-af68-45c4-ad2b-370552b453cf` |
| 5 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-f21ad882-6f35-4404-a91c-1dbbc5c0d7c1` |
| 6 | `POST /v1/auth/token` | 401 | 8 | `qa-c59924c5-1f2b-4efb-b04e-25abe0c7211e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4b0ca33b-6672-4706-8fc1-d86bdb60c108

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b0ca33b-6672-4706-8fc1-d86bdb60c108
Content-Type: application/json

--- request body ---
{"handle":"qa-58a86d850773","displayName":"QA 58a86d850773","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b0ca33b-6672-4706-8fc1-d86bdb60c108
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
Location: /v1/accounts/qa-58a86d850773
X-Served-Region: eu
Content-Length: 181

{"id":"acc_16b1399f-564c-45b3-9915-6b82d540595f","handle":"qa-58a86d850773","displayName":"QA 58a86d850773","region":"eu","role":"user","createdAt":"2026-11-13T09:42:09.536388687Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b603646c-608d-4734-9a53-4c14a808c23c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b603646c-608d-4734-9a53-4c14a808c23c
Content-Type: application/json

--- request body ---
{"handle":"qa-58a86d850773","password":"****"}

--- response: 200 in 20 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-b603646c-608d-4734-9a53-4c14a808c23c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_16b1399f-564c-45b3-9915-6b82d540595f"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-798e5e83-6a8d-49bc-b751-e95f2ffc6926

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 178a0c64-94e5-42b6-b39d-12f719ca07f1
X-Correlation-Id: qa-798e5e83-6a8d-49bc-b751-e95f2ffc6926
Content-Type: application/json

--- response: 503 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-798e5e83-6a8d-49bc-b751-e95f2ffc6926
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-798e5e83-6a8d-49bc-b751-e95f2ffc6926"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-212958d9-af68-45c4-ad2b-370552b453cf

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 178a0c64-94e5-42b6-b39d-12f719ca07f1
X-Correlation-Id: qa-212958d9-af68-45c4-ad2b-370552b453cf
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-212958d9-af68-45c4-ad2b-370552b453cf
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

{"id":"acc_16b1399f-564c-45b3-9915-6b82d540595f","handle":"qa-58a86d850773","displayName":"QA 58a86d850773","region":"eu","role":"user","createdAt":"2026-11-13T09:42:09.536388687Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f21ad882-6f35-4404-a91c-1dbbc5c0d7c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f21ad882-6f35-4404-a91c-1dbbc5c0d7c1
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f21ad882-6f35-4404-a91c-1dbbc5c0d7c1
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
correlation: qa-c59924c5-1f2b-4efb-b04e-25abe0c7211e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c59924c5-1f2b-4efb-b04e-25abe0c7211e
Content-Type: application/json

--- request body ---
{"handle":"qa-58a86d850773","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c59924c5-1f2b-4efb-b04e-25abe0c7211e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c59924c5-1f2b-4efb-b04e-25abe0c7211e"}
```

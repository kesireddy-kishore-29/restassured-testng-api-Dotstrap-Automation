# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/credits/purchases]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[15]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-e262dacc-989f-4648-904d-bacd30f13d99` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-4d50a974-2d00-4066-8159-facc962e2aae` |
| 3 | `POST /v1/auth/token` | 200 | 62 | `qa-88f12f21-6ff8-470d-8c70-c4eb17772c97` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-6348547d-fa1f-4662-b620-02b6c478896a` |
| 5 | `POST /v1/credits/purchases` | 503 | 13 | `qa-1ff3c0e3-755e-4eb7-8ca3-b78ca8e2449a` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-33fcd290-1596-45da-9da0-f46efa9099f7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-ce7a8861-38d0-4295-bb68-7635dc585e20` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-853e84cb-2b52-4f63-8a23-5ac6bf72d1e2` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-aabf618f-5403-4c74-8317-b4fa81c1b43f` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-0335d714-a86b-4318-aac8-158acf8bf9b3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e262dacc-989f-4648-904d-bacd30f13d99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e262dacc-989f-4648-904d-bacd30f13d99
Content-Type: application/json

--- request body ---
{"handle":"qa-5bb16f3e7ce6","displayName":"QA 5bb16f3e7ce6","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-e262dacc-989f-4648-904d-bacd30f13d99
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 7
Location: /v1/accounts/qa-5bb16f3e7ce6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d98235cf-bbe0-41fd-aa9a-b0372f6e99a4","handle":"qa-5bb16f3e7ce6","displayName":"QA 5bb16f3e7ce6","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.060960312Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4d50a974-2d00-4066-8159-facc962e2aae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d50a974-2d00-4066-8159-facc962e2aae
Content-Type: application/json

--- request body ---
{"handle":"qa-3f27ab3b5250","displayName":"QA 3f27ab3b5250","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d50a974-2d00-4066-8159-facc962e2aae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 7
Location: /v1/accounts/qa-3f27ab3b5250
X-Served-Region: eu
Content-Length: 181

{"id":"acc_afa8b9c6-f9bc-4cc7-89c4-c023ceba9b48","handle":"qa-3f27ab3b5250","displayName":"QA 3f27ab3b5250","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.112163904Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-88f12f21-6ff8-470d-8c70-c4eb17772c97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88f12f21-6ff8-470d-8c70-c4eb17772c97
Content-Type: application/json

--- request body ---
{"handle":"qa-5bb16f3e7ce6","password":"****"}

--- response: 200 in 62 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-88f12f21-6ff8-470d-8c70-c4eb17772c97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d98235cf-bbe0-41fd-aa9a-b0372f6e99a4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6348547d-fa1f-4662-b620-02b6c478896a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6348547d-fa1f-4662-b620-02b6c478896a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3f27ab3b5250","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-6348547d-fa1f-4662-b620-02b6c478896a
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
Location: /v1/conversations/cnv_ddb0bd01-fdbb-4b1d-9cc8-302f5f73a048
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ddb0bd01-fdbb-4b1d-9cc8-302f5f73a048","subject":"Error contract","status":"open","region":"eu","participants":["qa-5bb16f3e7ce6","qa-3f27ab3b5250"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:08.265564965Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1ff3c0e3-755e-4eb7-8ca3-b78ca8e2449a

--- request headers ---
Accept: application/json
X-Fault-Key: 7712f2e6-8cf1-4236-931c-203e658a7e39
Idempotency-Key: qa-15cc889e4b464dbda2f038bced136948
X-Fault: unavailable-once
X-Correlation-Id: qa-1ff3c0e3-755e-4eb7-8ca3-b78ca8e2449a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1ff3c0e3-755e-4eb7-8ca3-b78ca8e2449a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-1ff3c0e3-755e-4eb7-8ca3-b78ca8e2449a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-33fcd290-1596-45da-9da0-f46efa9099f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33fcd290-1596-45da-9da0-f46efa9099f7
Content-Type: application/json

--- request body ---
{"handle":"qa-3f27ab3b5250","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-33fcd290-1596-45da-9da0-f46efa9099f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_afa8b9c6-f9bc-4cc7-89c4-c023ceba9b48"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ce7a8861-38d0-4295-bb68-7635dc585e20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce7a8861-38d0-4295-bb68-7635dc585e20
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ce7a8861-38d0-4295-bb68-7635dc585e20
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-853e84cb-2b52-4f63-8a23-5ac6bf72d1e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-853e84cb-2b52-4f63-8a23-5ac6bf72d1e2
Content-Type: application/json

--- request body ---
{"handle":"qa-3f27ab3b5250","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-853e84cb-2b52-4f63-8a23-5ac6bf72d1e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-853e84cb-2b52-4f63-8a23-5ac6bf72d1e2"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aabf618f-5403-4c74-8317-b4fa81c1b43f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aabf618f-5403-4c74-8317-b4fa81c1b43f
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aabf618f-5403-4c74-8317-b4fa81c1b43f
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-0335d714-a86b-4318-aac8-158acf8bf9b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0335d714-a86b-4318-aac8-158acf8bf9b3
Content-Type: application/json

--- request body ---
{"handle":"qa-5bb16f3e7ce6","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0335d714-a86b-4318-aac8-158acf8bf9b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0335d714-a86b-4318-aac8-158acf8bf9b3"}
```

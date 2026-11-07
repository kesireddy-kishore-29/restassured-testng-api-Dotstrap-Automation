# Transcript: Every operation answers an outage with a 503 problem and Retry-After [DELETE /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[4]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-c4c24773-997a-435f-b737-ab6d5dbf75f0` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-19a91198-90d7-4772-9898-1beac441f097` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-6af0299f-482e-439b-9e36-fef3a2960cb6` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-85e49886-bc7d-418c-bcb3-8d303930229c` |
| 5 | `DELETE /v1/accounts/me` | 503 | 20 | `qa-e9d19758-0ad9-4e1a-b52f-c179e00e172d` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-b0072199-6089-4fd5-beac-4ef323b6d19f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-02251d09-57bf-47e6-a987-8064a934b264` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-31028f1f-7082-4c8a-b03b-1f1d6d6469cc` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-26d0bf72-09ae-4d62-b676-e773e6174d9c` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-a28d9e0b-7ef3-4c32-8614-e3276bebe203` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c4c24773-997a-435f-b737-ab6d5dbf75f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4c24773-997a-435f-b737-ab6d5dbf75f0
Content-Type: application/json

--- request body ---
{"handle":"qa-61d27da9860a","displayName":"QA 61d27da9860a","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4c24773-997a-435f-b737-ab6d5dbf75f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 9
Location: /v1/accounts/qa-61d27da9860a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f8496011-58c3-4100-a159-985b46290437","handle":"qa-61d27da9860a","displayName":"QA 61d27da9860a","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.353485401Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-19a91198-90d7-4772-9898-1beac441f097

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19a91198-90d7-4772-9898-1beac441f097
Content-Type: application/json

--- request body ---
{"handle":"qa-47dca8b9115d","displayName":"QA 47dca8b9115d","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-19a91198-90d7-4772-9898-1beac441f097
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 9
Location: /v1/accounts/qa-47dca8b9115d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cbdb6945-48b8-4a01-b960-81257d8d1324","handle":"qa-47dca8b9115d","displayName":"QA 47dca8b9115d","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.382490201Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6af0299f-482e-439b-9e36-fef3a2960cb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6af0299f-482e-439b-9e36-fef3a2960cb6
Content-Type: application/json

--- request body ---
{"handle":"qa-61d27da9860a","password":"****"}

--- response: 200 in 22 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-6af0299f-482e-439b-9e36-fef3a2960cb6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f8496011-58c3-4100-a159-985b46290437"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-85e49886-bc7d-418c-bcb3-8d303930229c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85e49886-bc7d-418c-bcb3-8d303930229c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-47dca8b9115d","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-85e49886-bc7d-418c-bcb3-8d303930229c
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
Location: /v1/conversations/cnv_5720f626-f320-48fd-8c4c-41260d107594
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5720f626-f320-48fd-8c4c-41260d107594","subject":"Error contract","status":"open","region":"eu","participants":["qa-61d27da9860a","qa-47dca8b9115d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:32.448781178Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e9d19758-0ad9-4e1a-b52f-c179e00e172d

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 6e37a728-4e69-4b74-8f02-448651fc0ae6
X-Correlation-Id: qa-e9d19758-0ad9-4e1a-b52f-c179e00e172d
Content-Type: application/json

--- response: 503 in 20 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e9d19758-0ad9-4e1a-b52f-c179e00e172d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-e9d19758-0ad9-4e1a-b52f-c179e00e172d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b0072199-6089-4fd5-beac-4ef323b6d19f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0072199-6089-4fd5-beac-4ef323b6d19f
Content-Type: application/json

--- request body ---
{"handle":"qa-47dca8b9115d","password":"****"}

--- response: 200 in 27 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0072199-6089-4fd5-beac-4ef323b6d19f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cbdb6945-48b8-4a01-b960-81257d8d1324"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-02251d09-57bf-47e6-a987-8064a934b264

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02251d09-57bf-47e6-a987-8064a934b264
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-02251d09-57bf-47e6-a987-8064a934b264
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
correlation: qa-31028f1f-7082-4c8a-b03b-1f1d6d6469cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31028f1f-7082-4c8a-b03b-1f1d6d6469cc
Content-Type: application/json

--- request body ---
{"handle":"qa-47dca8b9115d","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-31028f1f-7082-4c8a-b03b-1f1d6d6469cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-31028f1f-7082-4c8a-b03b-1f1d6d6469cc"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-26d0bf72-09ae-4d62-b676-e773e6174d9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26d0bf72-09ae-4d62-b676-e773e6174d9c
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-26d0bf72-09ae-4d62-b676-e773e6174d9c
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
correlation: qa-a28d9e0b-7ef3-4c32-8614-e3276bebe203

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a28d9e0b-7ef3-4c32-8614-e3276bebe203
Content-Type: application/json

--- request body ---
{"handle":"qa-61d27da9860a","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a28d9e0b-7ef3-4c32-8614-e3276bebe203
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a28d9e0b-7ef3-4c32-8614-e3276bebe203"}
```

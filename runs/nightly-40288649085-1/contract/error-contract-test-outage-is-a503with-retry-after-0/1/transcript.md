# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/auth/token]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[0]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-1594e16c-81ac-4eb8-ae16-94bda58a3753` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-29668bca-c0a2-4d35-9cf8-d5fcc63d7d8c` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-bddbf923-20c8-48e4-a9d9-d70ea6c1e655` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-afdfdc8f-7475-4c7d-bb4c-6b92f30e290e` |
| 5 | `POST /v1/auth/token` | 503 | 16 | `qa-53333588-ea5a-4542-ab33-cb24988b01ae` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-08011813-46ab-43e4-a7d2-acfffb15b732` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-b10ebcb3-63fd-4fec-8174-1a462a15e642` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-d4a02aba-7f31-466e-a548-b2515e6efd05` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-40e38921-3752-463d-af70-15d01fe2ca4d` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-301469ed-80d8-4c12-bf28-c9aad960f25d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1594e16c-81ac-4eb8-ae16-94bda58a3753

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1594e16c-81ac-4eb8-ae16-94bda58a3753
Content-Type: application/json

--- request body ---
{"handle":"qa-dafe1f87624b","displayName":"QA dafe1f87624b","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-1594e16c-81ac-4eb8-ae16-94bda58a3753
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-dafe1f87624b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7e7885be-4f2d-4dd1-94e7-cd707868fb86","handle":"qa-dafe1f87624b","displayName":"QA dafe1f87624b","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.259619605Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-29668bca-c0a2-4d35-9cf8-d5fcc63d7d8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29668bca-c0a2-4d35-9cf8-d5fcc63d7d8c
Content-Type: application/json

--- request body ---
{"handle":"qa-bfcdcf55912f","displayName":"QA bfcdcf55912f","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-29668bca-c0a2-4d35-9cf8-d5fcc63d7d8c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 10
Location: /v1/accounts/qa-bfcdcf55912f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3618cc07-75d3-4575-9ed9-2c7228470bbc","handle":"qa-bfcdcf55912f","displayName":"QA bfcdcf55912f","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.287405484Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bddbf923-20c8-48e4-a9d9-d70ea6c1e655

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bddbf923-20c8-48e4-a9d9-d70ea6c1e655
Content-Type: application/json

--- request body ---
{"handle":"qa-dafe1f87624b","password":"****"}

--- response: 200 in 28 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-bddbf923-20c8-48e4-a9d9-d70ea6c1e655
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7e7885be-4f2d-4dd1-94e7-cd707868fb86"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-afdfdc8f-7475-4c7d-bb4c-6b92f30e290e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afdfdc8f-7475-4c7d-bb4c-6b92f30e290e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bfcdcf55912f","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-afdfdc8f-7475-4c7d-bb4c-6b92f30e290e
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
Location: /v1/conversations/cnv_10e63615-b67a-4910-baaa-11463e57ba16
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_10e63615-b67a-4910-baaa-11463e57ba16","subject":"Error contract","status":"open","region":"eu","participants":["qa-dafe1f87624b","qa-bfcdcf55912f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:46.363126156Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-53333588-ea5a-4542-ab33-cb24988b01ae

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 054f3fec-5bcb-4927-a0b2-0f86af6f039d
X-Correlation-Id: qa-53333588-ea5a-4542-ab33-cb24988b01ae
Content-Type: application/json

--- request body ---
{"handle":"qa-dafe1f87624b","password":"****"}

--- response: 503 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-53333588-ea5a-4542-ab33-cb24988b01ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-53333588-ea5a-4542-ab33-cb24988b01ae"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-08011813-46ab-43e4-a7d2-acfffb15b732

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08011813-46ab-43e4-a7d2-acfffb15b732
Content-Type: application/json

--- request body ---
{"handle":"qa-bfcdcf55912f","password":"****"}

--- response: 200 in 35 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-08011813-46ab-43e4-a7d2-acfffb15b732
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3618cc07-75d3-4575-9ed9-2c7228470bbc"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b10ebcb3-63fd-4fec-8174-1a462a15e642

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b10ebcb3-63fd-4fec-8174-1a462a15e642
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b10ebcb3-63fd-4fec-8174-1a462a15e642
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
correlation: qa-d4a02aba-7f31-466e-a548-b2515e6efd05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4a02aba-7f31-466e-a548-b2515e6efd05
Content-Type: application/json

--- request body ---
{"handle":"qa-bfcdcf55912f","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d4a02aba-7f31-466e-a548-b2515e6efd05
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d4a02aba-7f31-466e-a548-b2515e6efd05"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-40e38921-3752-463d-af70-15d01fe2ca4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40e38921-3752-463d-af70-15d01fe2ca4d
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-40e38921-3752-463d-af70-15d01fe2ca4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-301469ed-80d8-4c12-bf28-c9aad960f25d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-301469ed-80d8-4c12-bf28-c9aad960f25d
Content-Type: application/json

--- request body ---
{"handle":"qa-dafe1f87624b","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-301469ed-80d8-4c12-bf28-c9aad960f25d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-301469ed-80d8-4c12-bf28-c9aad960f25d"}
```

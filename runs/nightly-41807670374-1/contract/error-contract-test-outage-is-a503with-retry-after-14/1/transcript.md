# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/ledger]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[14]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-f60b1c0e-2c08-4baa-acbb-845fd65aca4a` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-4b082117-6385-433c-9bb6-1bd68f15b115` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-2c10262a-367b-4a45-8f26-9aeb6cd12852` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-76cb9526-5c2a-4bd7-b3dc-176a5adeaacb` |
| 5 | `GET /v1/credits/ledger` | 503 | 5 | `qa-38f9ee7d-5ca8-404f-9b98-e4dc6b770066` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-ab8f7008-2bb0-42fb-a787-b92a53ce894e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-5539bad4-be2d-4f1e-ab90-54f85187fdc1` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-4d979317-2ded-45a5-8f08-666d97d5e4d7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-11bc1d5c-9616-4138-8fa4-93190878ec0e` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-62952abe-d221-49c5-8416-14269cbeecdc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f60b1c0e-2c08-4baa-acbb-845fd65aca4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f60b1c0e-2c08-4baa-acbb-845fd65aca4a
Content-Type: application/json

--- request body ---
{"handle":"qa-b4bfcf4b52f7","displayName":"QA b4bfcf4b52f7","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f60b1c0e-2c08-4baa-acbb-845fd65aca4a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 8
Location: /v1/accounts/qa-b4bfcf4b52f7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_514ccd4d-260c-48fc-8443-3721a7f3fa28","handle":"qa-b4bfcf4b52f7","displayName":"QA b4bfcf4b52f7","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.216375298Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4b082117-6385-433c-9bb6-1bd68f15b115

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b082117-6385-433c-9bb6-1bd68f15b115
Content-Type: application/json

--- request body ---
{"handle":"qa-cb5347481a82","displayName":"QA cb5347481a82","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b082117-6385-433c-9bb6-1bd68f15b115
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 8
Location: /v1/accounts/qa-cb5347481a82
X-Served-Region: eu
Content-Length: 181

{"id":"acc_633e434c-ac49-4ab8-884e-679e9b6816b8","handle":"qa-cb5347481a82","displayName":"QA cb5347481a82","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.233453012Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2c10262a-367b-4a45-8f26-9aeb6cd12852

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c10262a-367b-4a45-8f26-9aeb6cd12852
Content-Type: application/json

--- request body ---
{"handle":"qa-b4bfcf4b52f7","password":"****"}

--- response: 200 in 24 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c10262a-367b-4a45-8f26-9aeb6cd12852
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_514ccd4d-260c-48fc-8443-3721a7f3fa28"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-76cb9526-5c2a-4bd7-b3dc-176a5adeaacb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76cb9526-5c2a-4bd7-b3dc-176a5adeaacb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cb5347481a82","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-76cb9526-5c2a-4bd7-b3dc-176a5adeaacb
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
Location: /v1/conversations/cnv_eddbfc27-1e96-4d2b-9f19-43320d80b4b9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_eddbfc27-1e96-4d2b-9f19-43320d80b4b9","subject":"Error contract","status":"open","region":"eu","participants":["qa-b4bfcf4b52f7","qa-cb5347481a82"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:03.296126003Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-38f9ee7d-5ca8-404f-9b98-e4dc6b770066

--- request headers ---
Accept: application/json
X-Fault-Key: 0d426785-8d8a-421c-a35c-e75a616e4aac
X-Fault: unavailable-once
X-Correlation-Id: qa-38f9ee7d-5ca8-404f-9b98-e4dc6b770066
Content-Type: application/json

--- response: 503 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-38f9ee7d-5ca8-404f-9b98-e4dc6b770066
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-38f9ee7d-5ca8-404f-9b98-e4dc6b770066"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ab8f7008-2bb0-42fb-a787-b92a53ce894e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab8f7008-2bb0-42fb-a787-b92a53ce894e
Content-Type: application/json

--- request body ---
{"handle":"qa-cb5347481a82","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab8f7008-2bb0-42fb-a787-b92a53ce894e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_633e434c-ac49-4ab8-884e-679e9b6816b8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5539bad4-be2d-4f1e-ab90-54f85187fdc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5539bad4-be2d-4f1e-ab90-54f85187fdc1
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5539bad4-be2d-4f1e-ab90-54f85187fdc1
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
correlation: qa-4d979317-2ded-45a5-8f08-666d97d5e4d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d979317-2ded-45a5-8f08-666d97d5e4d7
Content-Type: application/json

--- request body ---
{"handle":"qa-cb5347481a82","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4d979317-2ded-45a5-8f08-666d97d5e4d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4d979317-2ded-45a5-8f08-666d97d5e4d7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-11bc1d5c-9616-4138-8fa4-93190878ec0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11bc1d5c-9616-4138-8fa4-93190878ec0e
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-11bc1d5c-9616-4138-8fa4-93190878ec0e
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
correlation: qa-62952abe-d221-49c5-8416-14269cbeecdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62952abe-d221-49c5-8416-14269cbeecdc
Content-Type: application/json

--- request body ---
{"handle":"qa-b4bfcf4b52f7","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-62952abe-d221-49c5-8416-14269cbeecdc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-62952abe-d221-49c5-8416-14269cbeecdc"}
```

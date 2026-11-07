# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-d4ee9a0b-2cdf-4b19-8821-4bf8416ba23a` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-0a7d03a0-eb36-430b-bc39-9e2f9bfa809e` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-f1e9ed31-eda1-44ed-9347-f7a9963c0cd8` |
| 4 | `POST /v1/conversations` | 201 | 38 | `qa-5b4c8a95-268d-4a16-b5e3-2fc0379d3770` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 35 | `qa-47cb5fcc-d969-47ff-ac7c-3816f434104e` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-ff855001-08f4-44a0-88a6-c839aac8971b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-dd634abd-76fa-4da1-8413-dafae595fa71` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-52915334-9ce5-4702-8f8e-69c8af50b20c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-ac4ea5b9-eb8f-4010-b343-411bbbc7d2ef` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-cd9ef9af-e610-40bb-9edd-f107a9d96ec7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d4ee9a0b-2cdf-4b19-8821-4bf8416ba23a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4ee9a0b-2cdf-4b19-8821-4bf8416ba23a
Content-Type: application/json

--- request body ---
{"handle":"qa-a3db29447917","displayName":"QA a3db29447917","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4ee9a0b-2cdf-4b19-8821-4bf8416ba23a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 9
Location: /v1/accounts/qa-a3db29447917
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b6b8a5aa-b566-4837-87b8-5ad3cdc04bf4","handle":"qa-a3db29447917","displayName":"QA a3db29447917","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.323318363Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0a7d03a0-eb36-430b-bc39-9e2f9bfa809e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a7d03a0-eb36-430b-bc39-9e2f9bfa809e
Content-Type: application/json

--- request body ---
{"handle":"qa-eb15e15107d5","displayName":"QA eb15e15107d5","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a7d03a0-eb36-430b-bc39-9e2f9bfa809e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 9
Location: /v1/accounts/qa-eb15e15107d5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_86f6dc0b-5974-4bb5-89e6-4ad67185430a","handle":"qa-eb15e15107d5","displayName":"QA eb15e15107d5","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.379244266Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f1e9ed31-eda1-44ed-9347-f7a9963c0cd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1e9ed31-eda1-44ed-9347-f7a9963c0cd8
Content-Type: application/json

--- request body ---
{"handle":"qa-a3db29447917","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1e9ed31-eda1-44ed-9347-f7a9963c0cd8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b6b8a5aa-b566-4837-87b8-5ad3cdc04bf4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5b4c8a95-268d-4a16-b5e3-2fc0379d3770

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b4c8a95-268d-4a16-b5e3-2fc0379d3770
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-eb15e15107d5","subject":"Error contract","message":"Hi"}

--- response: 201 in 38 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b4c8a95-268d-4a16-b5e3-2fc0379d3770
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
Location: /v1/conversations/cnv_32e506ac-537f-4a96-9203-071a7bf0a9c9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_32e506ac-537f-4a96-9203-071a7bf0a9c9","subject":"Error contract","status":"open","region":"eu","participants":["qa-a3db29447917","qa-eb15e15107d5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:36.507928830Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-a3db29447917
correlation: qa-47cb5fcc-d969-47ff-ac7c-3816f434104e

--- request headers ---
Accept: application/json
X-Fault-Key: bc57f4db-2e40-4fdf-b220-8f4c2374f36c
X-Fault: unavailable-once
X-Correlation-Id: qa-47cb5fcc-d969-47ff-ac7c-3816f434104e
Content-Type: application/json

--- response: 503 in 35 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-47cb5fcc-d969-47ff-ac7c-3816f434104e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-a3db29447917","correlationId":"qa-47cb5fcc-d969-47ff-ac7c-3816f434104e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ff855001-08f4-44a0-88a6-c839aac8971b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff855001-08f4-44a0-88a6-c839aac8971b
Content-Type: application/json

--- request body ---
{"handle":"qa-eb15e15107d5","password":"****"}

--- response: 200 in 35 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff855001-08f4-44a0-88a6-c839aac8971b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_86f6dc0b-5974-4bb5-89e6-4ad67185430a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dd634abd-76fa-4da1-8413-dafae595fa71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd634abd-76fa-4da1-8413-dafae595fa71
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dd634abd-76fa-4da1-8413-dafae595fa71
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
correlation: qa-52915334-9ce5-4702-8f8e-69c8af50b20c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52915334-9ce5-4702-8f8e-69c8af50b20c
Content-Type: application/json

--- request body ---
{"handle":"qa-eb15e15107d5","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-52915334-9ce5-4702-8f8e-69c8af50b20c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-52915334-9ce5-4702-8f8e-69c8af50b20c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ac4ea5b9-eb8f-4010-b343-411bbbc7d2ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac4ea5b9-eb8f-4010-b343-411bbbc7d2ef
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ac4ea5b9-eb8f-4010-b343-411bbbc7d2ef
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
correlation: qa-cd9ef9af-e610-40bb-9edd-f107a9d96ec7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd9ef9af-e610-40bb-9edd-f107a9d96ec7
Content-Type: application/json

--- request body ---
{"handle":"qa-a3db29447917","password":"****"}

--- response: 401 in 20 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cd9ef9af-e610-40bb-9edd-f107a9d96ec7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cd9ef9af-e610-40bb-9edd-f107a9d96ec7"}
```

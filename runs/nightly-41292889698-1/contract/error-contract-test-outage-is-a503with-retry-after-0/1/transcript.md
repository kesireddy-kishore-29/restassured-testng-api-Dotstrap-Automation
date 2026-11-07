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
| 1 | `POST /v1/accounts` | 201 | 405 | `qa-f27360b2-d239-4c11-a6e0-bf9e98c2aa9e` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-cc834f7f-bab4-459d-b199-a537402ff445` |
| 3 | `POST /v1/auth/token` | 200 | 74 | `qa-6dc6fea2-a4ed-41dd-b731-f43939e3f317` |
| 4 | `POST /v1/conversations` | 201 | 58 | `qa-3394b843-ce5a-4790-b1f5-b1f23f463a40` |
| 5 | `POST /v1/auth/token` | 503 | 46 | `qa-775b601f-ca51-4445-9b8f-0ccf0c708d25` |
| 6 | `POST /v1/auth/token` | 200 | 51 | `qa-7846888e-0a37-4608-b3f1-ad787d5edca7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 40 | `qa-4f8ec18f-009e-436f-8edc-5fd9970a77d7` |
| 8 | `POST /v1/auth/token` | 401 | 58 | `qa-76442cf4-ab8b-4a95-af88-99795b93ba22` |
| 9 | `DELETE /v1/accounts/me` | 204 | 54 | `qa-1a77eaa6-4d57-46c4-bd6e-855fbe040f08` |
| 10 | `POST /v1/auth/token` | 401 | 29 | `qa-c24618a5-4f34-4511-a446-d3df034ea482` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f27360b2-d239-4c11-a6e0-bf9e98c2aa9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f27360b2-d239-4c11-a6e0-bf9e98c2aa9e
Content-Type: application/json

--- request body ---
{"handle":"qa-6210a650bf47","displayName":"QA 6210a650bf47","password":"****","region":"eu"}

--- response: 201 in 405 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-f27360b2-d239-4c11-a6e0-bf9e98c2aa9e
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
Location: /v1/accounts/qa-6210a650bf47
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d21b29d0-7706-4550-add0-de7f0cfec562","handle":"qa-6210a650bf47","displayName":"QA 6210a650bf47","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.406337572Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cc834f7f-bab4-459d-b199-a537402ff445

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc834f7f-bab4-459d-b199-a537402ff445
Content-Type: application/json

--- request body ---
{"handle":"qa-3360f68ffb97","displayName":"QA 3360f68ffb97","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc834f7f-bab4-459d-b199-a537402ff445
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Location: /v1/accounts/qa-3360f68ffb97
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f31e9936-b206-43e0-8162-9f6c3bac921c","handle":"qa-3360f68ffb97","displayName":"QA 3360f68ffb97","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.790992682Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6dc6fea2-a4ed-41dd-b731-f43939e3f317

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dc6fea2-a4ed-41dd-b731-f43939e3f317
Content-Type: application/json

--- request body ---
{"handle":"qa-6210a650bf47","password":"****"}

--- response: 200 in 74 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-6dc6fea2-a4ed-41dd-b731-f43939e3f317
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d21b29d0-7706-4550-add0-de7f0cfec562"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3394b843-ce5a-4790-b1f5-b1f23f463a40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3394b843-ce5a-4790-b1f5-b1f23f463a40
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3360f68ffb97","subject":"Error contract","message":"Hi"}

--- response: 201 in 58 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-3394b843-ce5a-4790-b1f5-b1f23f463a40
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
Location: /v1/conversations/cnv_cfb00d38-743b-45be-88a7-1463f273050c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cfb00d38-743b-45be-88a7-1463f273050c","subject":"Error contract","status":"open","region":"eu","participants":["qa-6210a650bf47","qa-3360f68ffb97"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:20.990780490Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-775b601f-ca51-4445-9b8f-0ccf0c708d25

--- request headers ---
Accept: application/json
X-Fault-Key: 68c1a4a5-89b9-4ac1-bc18-c2d96a180b7b
X-Fault: unavailable-once
X-Correlation-Id: qa-775b601f-ca51-4445-9b8f-0ccf0c708d25
Content-Type: application/json

--- request body ---
{"handle":"qa-6210a650bf47","password":"****"}

--- response: 503 in 46 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-775b601f-ca51-4445-9b8f-0ccf0c708d25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-775b601f-ca51-4445-9b8f-0ccf0c708d25"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7846888e-0a37-4608-b3f1-ad787d5edca7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7846888e-0a37-4608-b3f1-ad787d5edca7
Content-Type: application/json

--- request body ---
{"handle":"qa-3360f68ffb97","password":"****"}

--- response: 200 in 51 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-7846888e-0a37-4608-b3f1-ad787d5edca7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f31e9936-b206-43e0-8162-9f6c3bac921c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f8ec18f-009e-436f-8edc-5fd9970a77d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f8ec18f-009e-436f-8edc-5fd9970a77d7
Content-Type: application/json

--- response: 204 in 40 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f8ec18f-009e-436f-8edc-5fd9970a77d7
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
correlation: qa-76442cf4-ab8b-4a95-af88-99795b93ba22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76442cf4-ab8b-4a95-af88-99795b93ba22
Content-Type: application/json

--- request body ---
{"handle":"qa-3360f68ffb97","password":"****"}

--- response: 401 in 58 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-76442cf4-ab8b-4a95-af88-99795b93ba22
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-76442cf4-ab8b-4a95-af88-99795b93ba22"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1a77eaa6-4d57-46c4-bd6e-855fbe040f08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a77eaa6-4d57-46c4-bd6e-855fbe040f08
Content-Type: application/json

--- response: 204 in 54 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1a77eaa6-4d57-46c4-bd6e-855fbe040f08
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
correlation: qa-c24618a5-4f34-4511-a446-d3df034ea482

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c24618a5-4f34-4511-a446-d3df034ea482
Content-Type: application/json

--- request body ---
{"handle":"qa-6210a650bf47","password":"****"}

--- response: 401 in 29 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c24618a5-4f34-4511-a446-d3df034ea482
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 514
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c24618a5-4f34-4511-a446-d3df034ea482"}
```

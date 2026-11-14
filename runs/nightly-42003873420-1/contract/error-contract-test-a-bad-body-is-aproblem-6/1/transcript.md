# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 52 | `qa-2fd0f6b0-030e-473b-8698-5fc23d86e410` |
| 2 | `POST /v1/accounts` | 201 | 84 | `qa-b245bfec-d96c-476c-840f-1bec235c06f1` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-01a8cf16-338e-43bd-ac09-63d0fd7c3f31` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-fcacde81-e6ae-4d14-81db-52214268fad2` |
| 5 | `PATCH /v1/accounts/me` | 400 | 20 | `qa-e052deb4-ad51-498c-9e05-e92a1209ba6c` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-da331d49-a464-46c8-a078-7bf2b5a88e14` |
| 7 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-9ed7a24f-c972-4926-9eca-a200f62123fe` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-90e2a135-8276-417d-9d4e-f07bc0a9b5d8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-7cdf3b53-d714-4285-9ceb-addca6260687` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-182daeb7-3c7b-401b-bfef-f8ab3a336dd6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2fd0f6b0-030e-473b-8698-5fc23d86e410

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fd0f6b0-030e-473b-8698-5fc23d86e410
Content-Type: application/json

--- request body ---
{"handle":"qa-d1ea950b7b7b","displayName":"QA d1ea950b7b7b","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fd0f6b0-030e-473b-8698-5fc23d86e410
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 8
Location: /v1/accounts/qa-d1ea950b7b7b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5c61f5d2-9f49-46b3-9ea2-4bd5bc1a079a","handle":"qa-d1ea950b7b7b","displayName":"QA d1ea950b7b7b","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.520043133Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b245bfec-d96c-476c-840f-1bec235c06f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b245bfec-d96c-476c-840f-1bec235c06f1
Content-Type: application/json

--- request body ---
{"handle":"qa-038fc8592b2b","displayName":"QA 038fc8592b2b","password":"****","region":"eu"}

--- response: 201 in 84 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-b245bfec-d96c-476c-840f-1bec235c06f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 7
Location: /v1/accounts/qa-038fc8592b2b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2cbde262-5820-46a6-9957-d87ba3e74688","handle":"qa-038fc8592b2b","displayName":"QA 038fc8592b2b","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.629283044Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-01a8cf16-338e-43bd-ac09-63d0fd7c3f31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01a8cf16-338e-43bd-ac09-63d0fd7c3f31
Content-Type: application/json

--- request body ---
{"handle":"qa-d1ea950b7b7b","password":"****"}

--- response: 200 in 25 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-01a8cf16-338e-43bd-ac09-63d0fd7c3f31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5c61f5d2-9f49-46b3-9ea2-4bd5bc1a079a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-fcacde81-e6ae-4d14-81db-52214268fad2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcacde81-e6ae-4d14-81db-52214268fad2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-038fc8592b2b","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-fcacde81-e6ae-4d14-81db-52214268fad2
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
Location: /v1/conversations/cnv_4bf34f39-d1af-4c9a-8e48-604a4cd05d88
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4bf34f39-d1af-4c9a-8e48-604a4cd05d88","subject":"Error contract","status":"open","region":"eu","participants":["qa-d1ea950b7b7b","qa-038fc8592b2b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:55.706368746Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-e052deb4-ad51-498c-9e05-e92a1209ba6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e052deb4-ad51-498c-9e05-e92a1209ba6c
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 20 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e052deb4-ad51-498c-9e05-e92a1209ba6c
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-e052deb4-ad51-498c-9e05-e92a1209ba6c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-da331d49-a464-46c8-a078-7bf2b5a88e14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da331d49-a464-46c8-a078-7bf2b5a88e14
Content-Type: application/json

--- request body ---
{"handle":"qa-038fc8592b2b","password":"****"}

--- response: 200 in 21 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-da331d49-a464-46c8-a078-7bf2b5a88e14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2cbde262-5820-46a6-9957-d87ba3e74688"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9ed7a24f-c972-4926-9eca-a200f62123fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ed7a24f-c972-4926-9eca-a200f62123fe
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9ed7a24f-c972-4926-9eca-a200f62123fe
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
correlation: qa-90e2a135-8276-417d-9d4e-f07bc0a9b5d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90e2a135-8276-417d-9d4e-f07bc0a9b5d8
Content-Type: application/json

--- request body ---
{"handle":"qa-038fc8592b2b","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90e2a135-8276-417d-9d4e-f07bc0a9b5d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-90e2a135-8276-417d-9d4e-f07bc0a9b5d8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7cdf3b53-d714-4285-9ceb-addca6260687

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cdf3b53-d714-4285-9ceb-addca6260687
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7cdf3b53-d714-4285-9ceb-addca6260687
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-182daeb7-3c7b-401b-bfef-f8ab3a336dd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-182daeb7-3c7b-401b-bfef-f8ab3a336dd6
Content-Type: application/json

--- request body ---
{"handle":"qa-d1ea950b7b7b","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-182daeb7-3c7b-401b-bfef-f8ab3a336dd6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-182daeb7-3c7b-401b-bfef-f8ab3a336dd6"}
```

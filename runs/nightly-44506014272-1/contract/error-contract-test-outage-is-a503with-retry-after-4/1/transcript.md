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
| 1 | `POST /v1/accounts` | 201 | 63 | `qa-94c9e721-873f-4e35-980c-0ff372d4bd5e` |
| 2 | `POST /v1/accounts` | 201 | 49 | `qa-462c4921-7663-40f9-a8c7-59377ea6e4a2` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-5f96b8ae-63d5-409c-a70e-44f3ab132308` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-2b2b579f-0a5a-4d83-9e6a-712f89895fdd` |
| 5 | `DELETE /v1/accounts/me` | 503 | 27 | `qa-3a997c08-e9d6-4860-ab9c-4d2f157ab538` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-b79cc9f8-da76-4442-b7ce-d7b2f13dbded` |
| 7 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-e4473d61-86fb-4aad-916b-0f606c933dfc` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-27c7e031-bfbf-4bfc-a4de-d5f06dece141` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-30f0352b-d358-4c27-9373-1cac870f796d` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-011327c2-f31b-401d-be30-f692ce2eeba2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-94c9e721-873f-4e35-980c-0ff372d4bd5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94c9e721-873f-4e35-980c-0ff372d4bd5e
Content-Type: application/json

--- request body ---
{"handle":"qa-4412619feb0d","displayName":"QA 4412619feb0d","password":"****","region":"eu"}

--- response: 201 in 63 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-94c9e721-873f-4e35-980c-0ff372d4bd5e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 7
Location: /v1/accounts/qa-4412619feb0d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_48b629f8-6d3b-4066-bb34-f09dea2447ce","handle":"qa-4412619feb0d","displayName":"QA 4412619feb0d","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.319375388Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-462c4921-7663-40f9-a8c7-59377ea6e4a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-462c4921-7663-40f9-a8c7-59377ea6e4a2
Content-Type: application/json

--- request body ---
{"handle":"qa-7ee476940a7d","displayName":"QA 7ee476940a7d","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-462c4921-7663-40f9-a8c7-59377ea6e4a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 473
RateLimit-Reset: 7
Location: /v1/accounts/qa-7ee476940a7d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49df45dd-25bd-4225-aa24-b7514b28d4ec","handle":"qa-7ee476940a7d","displayName":"QA 7ee476940a7d","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.420674895Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5f96b8ae-63d5-409c-a70e-44f3ab132308

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f96b8ae-63d5-409c-a70e-44f3ab132308
Content-Type: application/json

--- request body ---
{"handle":"qa-4412619feb0d","password":"****"}

--- response: 200 in 42 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f96b8ae-63d5-409c-a70e-44f3ab132308
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_48b629f8-6d3b-4066-bb34-f09dea2447ce"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2b2b579f-0a5a-4d83-9e6a-712f89895fdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b2b579f-0a5a-4d83-9e6a-712f89895fdd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7ee476940a7d","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b2b579f-0a5a-4d83-9e6a-712f89895fdd
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
Location: /v1/conversations/cnv_47a81661-34c5-4666-a1c3-0039afc215f5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_47a81661-34c5-4666-a1c3-0039afc215f5","subject":"Error contract","status":"open","region":"eu","participants":["qa-4412619feb0d","qa-7ee476940a7d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:25.516644874Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3a997c08-e9d6-4860-ab9c-4d2f157ab538

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: e9e978f7-e0b4-4879-be71-d02c0424286a
X-Correlation-Id: qa-3a997c08-e9d6-4860-ab9c-4d2f157ab538
Content-Type: application/json

--- response: 503 in 27 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a997c08-e9d6-4860-ab9c-4d2f157ab538
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-3a997c08-e9d6-4860-ab9c-4d2f157ab538"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b79cc9f8-da76-4442-b7ce-d7b2f13dbded

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b79cc9f8-da76-4442-b7ce-d7b2f13dbded
Content-Type: application/json

--- request body ---
{"handle":"qa-7ee476940a7d","password":"****"}

--- response: 200 in 32 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-b79cc9f8-da76-4442-b7ce-d7b2f13dbded
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_49df45dd-25bd-4225-aa24-b7514b28d4ec"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e4473d61-86fb-4aad-916b-0f606c933dfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4473d61-86fb-4aad-916b-0f606c933dfc
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e4473d61-86fb-4aad-916b-0f606c933dfc
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
correlation: qa-27c7e031-bfbf-4bfc-a4de-d5f06dece141

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27c7e031-bfbf-4bfc-a4de-d5f06dece141
Content-Type: application/json

--- request body ---
{"handle":"qa-7ee476940a7d","password":"****"}

--- response: 401 in 26 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27c7e031-bfbf-4bfc-a4de-d5f06dece141
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-27c7e031-bfbf-4bfc-a4de-d5f06dece141"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-30f0352b-d358-4c27-9373-1cac870f796d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30f0352b-d358-4c27-9373-1cac870f796d
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-30f0352b-d358-4c27-9373-1cac870f796d
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
correlation: qa-011327c2-f31b-401d-be30-f692ce2eeba2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-011327c2-f31b-401d-be30-f692ce2eeba2
Content-Type: application/json

--- request body ---
{"handle":"qa-4412619feb0d","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-011327c2-f31b-401d-be30-f692ce2eeba2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-011327c2-f31b-401d-be30-f692ce2eeba2"}
```

# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-cc9c050a-f113-4a5c-bbd7-e6525f74f7f2` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-37582af6-8d71-4a52-be10-293bc2678112` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-09d8cf3a-f705-4221-b191-44b1bd5327df` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-96e55d90-47ca-42e1-b3b3-7da02d97a409` |
| 5 | `POST /v1/accounts` | 422 | 17 | `qa-d11a820d-0fa5-45a6-b8ac-aef67241f1db` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-bad96038-3b8a-4edc-adbb-f4114f3e5938` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-94e50172-bbc3-4581-8676-4f2024166523` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-5c680da6-989a-448b-9d13-413addcfb973` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-3b6c4614-07a8-4f89-8bb4-fee119003ba9` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-0bc8174d-34b8-43eb-91f6-03429afce651` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cc9c050a-f113-4a5c-bbd7-e6525f74f7f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc9c050a-f113-4a5c-bbd7-e6525f74f7f2
Content-Type: application/json

--- request body ---
{"handle":"qa-620d12ec0394","displayName":"QA 620d12ec0394","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc9c050a-f113-4a5c-bbd7-e6525f74f7f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 8
Location: /v1/accounts/qa-620d12ec0394
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c3f51a58-61f9-471c-abf5-5e8555bf7bd5","handle":"qa-620d12ec0394","displayName":"QA 620d12ec0394","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.422460200Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-37582af6-8d71-4a52-be10-293bc2678112

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37582af6-8d71-4a52-be10-293bc2678112
Content-Type: application/json

--- request body ---
{"handle":"qa-1815dd485f16","displayName":"QA 1815dd485f16","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-37582af6-8d71-4a52-be10-293bc2678112
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 8
Location: /v1/accounts/qa-1815dd485f16
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a7dc7b5c-16f2-4cda-8728-aa7e8da599d7","handle":"qa-1815dd485f16","displayName":"QA 1815dd485f16","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.482966866Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-09d8cf3a-f705-4221-b191-44b1bd5327df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09d8cf3a-f705-4221-b191-44b1bd5327df
Content-Type: application/json

--- request body ---
{"handle":"qa-620d12ec0394","password":"****"}

--- response: 200 in 38 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-09d8cf3a-f705-4221-b191-44b1bd5327df
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c3f51a58-61f9-471c-abf5-5e8555bf7bd5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-96e55d90-47ca-42e1-b3b3-7da02d97a409

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96e55d90-47ca-42e1-b3b3-7da02d97a409
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1815dd485f16","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-96e55d90-47ca-42e1-b3b3-7da02d97a409
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
Location: /v1/conversations/cnv_5c0baf79-c5f6-4afc-ae61-d468320d5f49
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5c0baf79-c5f6-4afc-ae61-d468320d5f49","subject":"Error contract","status":"open","region":"eu","participants":["qa-620d12ec0394","qa-1815dd485f16"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:58.569805662Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-d11a820d-0fa5-45a6-b8ac-aef67241f1db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d11a820d-0fa5-45a6-b8ac-aef67241f1db
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 17 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d11a820d-0fa5-45a6-b8ac-aef67241f1db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 8
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-d11a820d-0fa5-45a6-b8ac-aef67241f1db","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bad96038-3b8a-4edc-adbb-f4114f3e5938

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bad96038-3b8a-4edc-adbb-f4114f3e5938
Content-Type: application/json

--- request body ---
{"handle":"qa-1815dd485f16","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-bad96038-3b8a-4edc-adbb-f4114f3e5938
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a7dc7b5c-16f2-4cda-8728-aa7e8da599d7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-94e50172-bbc3-4581-8676-4f2024166523

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94e50172-bbc3-4581-8676-4f2024166523
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-94e50172-bbc3-4581-8676-4f2024166523
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
correlation: qa-5c680da6-989a-448b-9d13-413addcfb973

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c680da6-989a-448b-9d13-413addcfb973
Content-Type: application/json

--- request body ---
{"handle":"qa-1815dd485f16","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5c680da6-989a-448b-9d13-413addcfb973
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5c680da6-989a-448b-9d13-413addcfb973"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3b6c4614-07a8-4f89-8bb4-fee119003ba9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b6c4614-07a8-4f89-8bb4-fee119003ba9
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3b6c4614-07a8-4f89-8bb4-fee119003ba9
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
correlation: qa-0bc8174d-34b8-43eb-91f6-03429afce651

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bc8174d-34b8-43eb-91f6-03429afce651
Content-Type: application/json

--- request body ---
{"handle":"qa-620d12ec0394","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0bc8174d-34b8-43eb-91f6-03429afce651
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0bc8174d-34b8-43eb-91f6-03429afce651"}
```

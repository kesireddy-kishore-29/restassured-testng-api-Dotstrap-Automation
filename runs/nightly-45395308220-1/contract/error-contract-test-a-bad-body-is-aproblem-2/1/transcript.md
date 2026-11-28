# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-323385d7-233d-4140-904c-542f492f7928` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-cb0ff71a-432a-4290-b387-6b190453ad38` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-e19e6309-7e8c-402a-9a54-a3418796bfce` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-a23e7293-8037-4a62-abf5-06e41855d0a8` |
| 5 | `POST /v1/auth/token` | 422 | 52 | `qa-42b1ce6d-9c1b-4328-b2b8-44ad8a3c8087` |
| 6 | `POST /v1/auth/token` | 200 | 46 | `qa-d3086a2f-852d-4e0f-a1cc-0c74d0d12ac6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-d84bc30f-855b-4711-80bf-fcb6bb57daf0` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-e45f4ea1-5116-4f9b-b6f6-dabd5aec4698` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-d245c4e0-88b2-4524-b843-8a13306f8afb` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-b41d4ea5-1fbb-465d-95f9-7e3eec6f3039` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-323385d7-233d-4140-904c-542f492f7928

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-323385d7-233d-4140-904c-542f492f7928
Content-Type: application/json

--- request body ---
{"handle":"qa-f749064592e1","displayName":"QA f749064592e1","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-323385d7-233d-4140-904c-542f492f7928
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 10
Location: /v1/accounts/qa-f749064592e1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5267c1d6-1062-4498-8354-5effd3dfdf33","handle":"qa-f749064592e1","displayName":"QA f749064592e1","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.144225479Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cb0ff71a-432a-4290-b387-6b190453ad38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb0ff71a-432a-4290-b387-6b190453ad38
Content-Type: application/json

--- request body ---
{"handle":"qa-fd8d1f3bea8e","displayName":"QA fd8d1f3bea8e","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb0ff71a-432a-4290-b387-6b190453ad38
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Location: /v1/accounts/qa-fd8d1f3bea8e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_59a5da86-2615-4a8e-b796-2796d9f79335","handle":"qa-fd8d1f3bea8e","displayName":"QA fd8d1f3bea8e","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.182858615Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e19e6309-7e8c-402a-9a54-a3418796bfce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e19e6309-7e8c-402a-9a54-a3418796bfce
Content-Type: application/json

--- request body ---
{"handle":"qa-f749064592e1","password":"****"}

--- response: 200 in 29 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-e19e6309-7e8c-402a-9a54-a3418796bfce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5267c1d6-1062-4498-8354-5effd3dfdf33"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a23e7293-8037-4a62-abf5-06e41855d0a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a23e7293-8037-4a62-abf5-06e41855d0a8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fd8d1f3bea8e","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-a23e7293-8037-4a62-abf5-06e41855d0a8
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
Location: /v1/conversations/cnv_6df8d549-8d04-47f9-b21d-ed04750289af
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6df8d549-8d04-47f9-b21d-ed04750289af","subject":"Error contract","status":"open","region":"eu","participants":["qa-f749064592e1","qa-fd8d1f3bea8e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:13.254503434Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-42b1ce6d-9c1b-4328-b2b8-44ad8a3c8087

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42b1ce6d-9c1b-4328-b2b8-44ad8a3c8087
Content-Type: application/json

--- request body ---
{"handle":"qa-f749064592e1","password":"****","ttlSeconds":0}

--- response: 422 in 52 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-42b1ce6d-9c1b-4328-b2b8-44ad8a3c8087
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 9
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-42b1ce6d-9c1b-4328-b2b8-44ad8a3c8087","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d3086a2f-852d-4e0f-a1cc-0c74d0d12ac6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3086a2f-852d-4e0f-a1cc-0c74d0d12ac6
Content-Type: application/json

--- request body ---
{"handle":"qa-fd8d1f3bea8e","password":"****"}

--- response: 200 in 46 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3086a2f-852d-4e0f-a1cc-0c74d0d12ac6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_59a5da86-2615-4a8e-b796-2796d9f79335"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d84bc30f-855b-4711-80bf-fcb6bb57daf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d84bc30f-855b-4711-80bf-fcb6bb57daf0
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d84bc30f-855b-4711-80bf-fcb6bb57daf0
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
correlation: qa-e45f4ea1-5116-4f9b-b6f6-dabd5aec4698

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e45f4ea1-5116-4f9b-b6f6-dabd5aec4698
Content-Type: application/json

--- request body ---
{"handle":"qa-fd8d1f3bea8e","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e45f4ea1-5116-4f9b-b6f6-dabd5aec4698
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e45f4ea1-5116-4f9b-b6f6-dabd5aec4698"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d245c4e0-88b2-4524-b843-8a13306f8afb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d245c4e0-88b2-4524-b843-8a13306f8afb
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d245c4e0-88b2-4524-b843-8a13306f8afb
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
correlation: qa-b41d4ea5-1fbb-465d-95f9-7e3eec6f3039

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b41d4ea5-1fbb-465d-95f9-7e3eec6f3039
Content-Type: application/json

--- request body ---
{"handle":"qa-f749064592e1","password":"****"}

--- response: 401 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b41d4ea5-1fbb-465d-95f9-7e3eec6f3039
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b41d4ea5-1fbb-465d-95f9-7e3eec6f3039"}
```

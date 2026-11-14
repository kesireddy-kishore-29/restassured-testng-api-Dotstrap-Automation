# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[9]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-dfb640da-c1c3-488c-b14b-cd6f8b8e979d` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-26a1cbae-aaf8-4f3c-8510-cb44ebd769fc` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-d820fed4-046d-4555-8bf1-eabbb81707bb` |
| 4 | `POST /v1/conversations` | 201 | 4 | `qa-d0818490-66e7-4e2e-a7b7-754c12298abd` |
| 5 | `POST /v1/conversations` | 400 | 24 | `qa-cbaa554f-6925-4538-ac9e-56d2d221eaa5` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-32d4670d-7302-4649-a54f-0f1eae3086dc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-e5b00d04-0fbe-49bd-825b-070df17893dc` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-20f70e9c-2333-43fc-8910-42bdb19cc498` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-3dd1ddd0-d1d2-4515-94b6-160b8a509c0b` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-db380a61-1560-4b7d-af3c-ee189acbd5f1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dfb640da-c1c3-488c-b14b-cd6f8b8e979d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfb640da-c1c3-488c-b14b-cd6f8b8e979d
Content-Type: application/json

--- request body ---
{"handle":"qa-78363b108f81","displayName":"QA 78363b108f81","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfb640da-c1c3-488c-b14b-cd6f8b8e979d
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
Location: /v1/accounts/qa-78363b108f81
X-Served-Region: eu
Content-Length: 181

{"id":"acc_40ceb84c-1f68-4000-8b67-d2b16c1ffb5b","handle":"qa-78363b108f81","displayName":"QA 78363b108f81","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.838400746Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-26a1cbae-aaf8-4f3c-8510-cb44ebd769fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26a1cbae-aaf8-4f3c-8510-cb44ebd769fc
Content-Type: application/json

--- request body ---
{"handle":"qa-168a332a8579","displayName":"QA 168a332a8579","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-26a1cbae-aaf8-4f3c-8510-cb44ebd769fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 8
Location: /v1/accounts/qa-168a332a8579
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b128740-83a5-492f-adb8-94b5d895a1ee","handle":"qa-168a332a8579","displayName":"QA 168a332a8579","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.881836382Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d820fed4-046d-4555-8bf1-eabbb81707bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d820fed4-046d-4555-8bf1-eabbb81707bb
Content-Type: application/json

--- request body ---
{"handle":"qa-78363b108f81","password":"****"}

--- response: 200 in 27 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-d820fed4-046d-4555-8bf1-eabbb81707bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_40ceb84c-1f68-4000-8b67-d2b16c1ffb5b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d0818490-66e7-4e2e-a7b7-754c12298abd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0818490-66e7-4e2e-a7b7-754c12298abd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-168a332a8579","subject":"Error contract","message":"Hi"}

--- response: 201 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0818490-66e7-4e2e-a7b7-754c12298abd
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
Location: /v1/conversations/cnv_beb80198-f96a-443b-ac4e-2e75179257cd
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_beb80198-f96a-443b-ac4e-2e75179257cd","subject":"Error contract","status":"open","region":"eu","participants":["qa-78363b108f81","qa-168a332a8579"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:11.934724612Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-cbaa554f-6925-4538-ac9e-56d2d221eaa5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbaa554f-6925-4538-ac9e-56d2d221eaa5
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cbaa554f-6925-4538-ac9e-56d2d221eaa5
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
Content-Length: 258

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-cbaa554f-6925-4538-ac9e-56d2d221eaa5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-32d4670d-7302-4649-a54f-0f1eae3086dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32d4670d-7302-4649-a54f-0f1eae3086dc
Content-Type: application/json

--- request body ---
{"handle":"qa-168a332a8579","password":"****"}

--- response: 200 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-32d4670d-7302-4649-a54f-0f1eae3086dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b128740-83a5-492f-adb8-94b5d895a1ee"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e5b00d04-0fbe-49bd-825b-070df17893dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5b00d04-0fbe-49bd-825b-070df17893dc
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e5b00d04-0fbe-49bd-825b-070df17893dc
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
correlation: qa-20f70e9c-2333-43fc-8910-42bdb19cc498

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20f70e9c-2333-43fc-8910-42bdb19cc498
Content-Type: application/json

--- request body ---
{"handle":"qa-168a332a8579","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-20f70e9c-2333-43fc-8910-42bdb19cc498
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-20f70e9c-2333-43fc-8910-42bdb19cc498"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3dd1ddd0-d1d2-4515-94b6-160b8a509c0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3dd1ddd0-d1d2-4515-94b6-160b8a509c0b
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3dd1ddd0-d1d2-4515-94b6-160b8a509c0b
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
correlation: qa-db380a61-1560-4b7d-af3c-ee189acbd5f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db380a61-1560-4b7d-af3c-ee189acbd5f1
Content-Type: application/json

--- request body ---
{"handle":"qa-78363b108f81","password":"****"}

--- response: 401 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db380a61-1560-4b7d-af3c-ee189acbd5f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-db380a61-1560-4b7d-af3c-ee189acbd5f1"}
```

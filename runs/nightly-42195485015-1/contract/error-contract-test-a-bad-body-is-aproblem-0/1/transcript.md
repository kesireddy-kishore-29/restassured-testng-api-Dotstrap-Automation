# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 49 | `qa-cc234ccc-0617-4304-bddc-9512feef4a09` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-411681d6-5805-451c-874e-09b9c74bf0cb` |
| 3 | `POST /v1/auth/token` | 200 | 44 | `qa-697b7168-93ba-4739-9801-f4492c3e1a03` |
| 4 | `POST /v1/conversations` | 201 | 28 | `qa-74f01ba8-59e8-41fd-92e8-f8907234324a` |
| 5 | `POST /v1/auth/token` | 400 | 30 | `qa-87d6bca1-87d8-4606-8f83-d1bafa13fdfe` |
| 6 | `POST /v1/auth/token` | 200 | 58 | `qa-d2abb7b6-2282-41a8-9d30-06484a44c8b3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-d3f6b575-d3e9-4d10-ab46-67cbd8ac7f33` |
| 8 | `POST /v1/auth/token` | 401 | 54 | `qa-d2d5f400-8872-493f-bed2-dd6730aa21de` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-ce0e1f06-afa3-4a9f-88f7-5245a89eef5a` |
| 10 | `POST /v1/auth/token` | 401 | 39 | `qa-f1da2974-5f79-4393-9f1a-36cce38c7e45` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cc234ccc-0617-4304-bddc-9512feef4a09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc234ccc-0617-4304-bddc-9512feef4a09
Content-Type: application/json

--- request body ---
{"handle":"qa-e3fc0cf9cdee","displayName":"QA e3fc0cf9cdee","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc234ccc-0617-4304-bddc-9512feef4a09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-e3fc0cf9cdee
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f93df241-9f4f-4588-b3fc-16b12d8e7cbf","handle":"qa-e3fc0cf9cdee","displayName":"QA e3fc0cf9cdee","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.190464103Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-411681d6-5805-451c-874e-09b9c74bf0cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-411681d6-5805-451c-874e-09b9c74bf0cb
Content-Type: application/json

--- request body ---
{"handle":"qa-0f6ea34839d7","displayName":"QA 0f6ea34839d7","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-411681d6-5805-451c-874e-09b9c74bf0cb
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
Location: /v1/accounts/qa-0f6ea34839d7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5487ca60-bc61-4ecb-aa80-9c9817a5d831","handle":"qa-0f6ea34839d7","displayName":"QA 0f6ea34839d7","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.230869098Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-697b7168-93ba-4739-9801-f4492c3e1a03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-697b7168-93ba-4739-9801-f4492c3e1a03
Content-Type: application/json

--- request body ---
{"handle":"qa-e3fc0cf9cdee","password":"****"}

--- response: 200 in 44 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-697b7168-93ba-4739-9801-f4492c3e1a03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f93df241-9f4f-4588-b3fc-16b12d8e7cbf"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-74f01ba8-59e8-41fd-92e8-f8907234324a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74f01ba8-59e8-41fd-92e8-f8907234324a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0f6ea34839d7","subject":"Error contract","message":"Hi"}

--- response: 201 in 28 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-74f01ba8-59e8-41fd-92e8-f8907234324a
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
Location: /v1/conversations/cnv_32d01c45-9549-4c2a-9e35-f8f25ecb200f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_32d01c45-9549-4c2a-9e35-f8f25ecb200f","subject":"Error contract","status":"open","region":"eu","participants":["qa-e3fc0cf9cdee","qa-0f6ea34839d7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:31.349939983Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-87d6bca1-87d8-4606-8f83-d1bafa13fdfe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87d6bca1-87d8-4606-8f83-d1bafa13fdfe
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 30 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-87d6bca1-87d8-4606-8f83-d1bafa13fdfe
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
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-87d6bca1-87d8-4606-8f83-d1bafa13fdfe"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d2abb7b6-2282-41a8-9d30-06484a44c8b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2abb7b6-2282-41a8-9d30-06484a44c8b3
Content-Type: application/json

--- request body ---
{"handle":"qa-0f6ea34839d7","password":"****"}

--- response: 200 in 58 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2abb7b6-2282-41a8-9d30-06484a44c8b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5487ca60-bc61-4ecb-aa80-9c9817a5d831"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d3f6b575-d3e9-4d10-ab46-67cbd8ac7f33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3f6b575-d3e9-4d10-ab46-67cbd8ac7f33
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d3f6b575-d3e9-4d10-ab46-67cbd8ac7f33
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
correlation: qa-d2d5f400-8872-493f-bed2-dd6730aa21de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2d5f400-8872-493f-bed2-dd6730aa21de
Content-Type: application/json

--- request body ---
{"handle":"qa-0f6ea34839d7","password":"****"}

--- response: 401 in 54 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d2d5f400-8872-493f-bed2-dd6730aa21de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d2d5f400-8872-493f-bed2-dd6730aa21de"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ce0e1f06-afa3-4a9f-88f7-5245a89eef5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce0e1f06-afa3-4a9f-88f7-5245a89eef5a
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ce0e1f06-afa3-4a9f-88f7-5245a89eef5a
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
correlation: qa-f1da2974-5f79-4393-9f1a-36cce38c7e45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1da2974-5f79-4393-9f1a-36cce38c7e45
Content-Type: application/json

--- request body ---
{"handle":"qa-e3fc0cf9cdee","password":"****"}

--- response: 401 in 39 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f1da2974-5f79-4393-9f1a-36cce38c7e45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f1da2974-5f79-4393-9f1a-36cce38c7e45"}
```

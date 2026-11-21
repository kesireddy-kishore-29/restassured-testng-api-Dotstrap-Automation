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
| 1 | `POST /v1/accounts` | 201 | 52 | `qa-7d07fda6-59e4-4c98-915c-1fd495cc6b8a` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-906ce98d-c9c6-4aa8-b6f2-7b47f048c9bd` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-6c8e2fdd-884d-4058-8fba-c1884d520305` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-76b8a752-eb81-4d54-95bb-9ae24e2fb4d2` |
| 5 | `POST /v1/auth/token` | 400 | 4 | `qa-da9c930d-0dc0-4fa4-a94d-ab7773004417` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-7347c773-4192-40a4-9520-ff86804913fa` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-42614011-9989-4274-8a4a-f8e8b8c55161` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-4140b1ce-1ccf-419b-a963-408da51f6f80` |
| 9 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-3531fd92-b344-430b-938b-c9dd5bfb329c` |
| 10 | `POST /v1/auth/token` | 401 | 39 | `qa-3bfbafa5-a391-49a9-9cb1-69663a2f2feb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7d07fda6-59e4-4c98-915c-1fd495cc6b8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d07fda6-59e4-4c98-915c-1fd495cc6b8a
Content-Type: application/json

--- request body ---
{"handle":"qa-6cff13a19f4b","displayName":"QA 6cff13a19f4b","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d07fda6-59e4-4c98-915c-1fd495cc6b8a
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
Location: /v1/accounts/qa-6cff13a19f4b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e30c1de-1c58-4b8b-b0ef-76d21916e7c5","handle":"qa-6cff13a19f4b","displayName":"QA 6cff13a19f4b","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.541296740Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-906ce98d-c9c6-4aa8-b6f2-7b47f048c9bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-906ce98d-c9c6-4aa8-b6f2-7b47f048c9bd
Content-Type: application/json

--- request body ---
{"handle":"qa-4eb4da1ae295","displayName":"QA 4eb4da1ae295","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-906ce98d-c9c6-4aa8-b6f2-7b47f048c9bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 10
Location: /v1/accounts/qa-4eb4da1ae295
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7c09bea5-f858-479f-b773-f5eb7aacbdef","handle":"qa-4eb4da1ae295","displayName":"QA 4eb4da1ae295","region":"eu","role":"user","createdAt":"2026-11-18T10:19:50.581843838Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6c8e2fdd-884d-4058-8fba-c1884d520305

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c8e2fdd-884d-4058-8fba-c1884d520305
Content-Type: application/json

--- request body ---
{"handle":"qa-6cff13a19f4b","password":"****"}

--- response: 200 in 24 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c8e2fdd-884d-4058-8fba-c1884d520305
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6e30c1de-1c58-4b8b-b0ef-76d21916e7c5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-76b8a752-eb81-4d54-95bb-9ae24e2fb4d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76b8a752-eb81-4d54-95bb-9ae24e2fb4d2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4eb4da1ae295","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-76b8a752-eb81-4d54-95bb-9ae24e2fb4d2
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
Location: /v1/conversations/cnv_9bceee2e-eceb-4301-a497-61aee6790916
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9bceee2e-eceb-4301-a497-61aee6790916","subject":"Error contract","status":"open","region":"eu","participants":["qa-6cff13a19f4b","qa-4eb4da1ae295"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:50.647975111Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-da9c930d-0dc0-4fa4-a94d-ab7773004417

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da9c930d-0dc0-4fa4-a94d-ab7773004417
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da9c930d-0dc0-4fa4-a94d-ab7773004417
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 9
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-da9c930d-0dc0-4fa4-a94d-ab7773004417"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7347c773-4192-40a4-9520-ff86804913fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7347c773-4192-40a4-9520-ff86804913fa
Content-Type: application/json

--- request body ---
{"handle":"qa-4eb4da1ae295","password":"****"}

--- response: 200 in 36 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-7347c773-4192-40a4-9520-ff86804913fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7c09bea5-f858-479f-b773-f5eb7aacbdef"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-42614011-9989-4274-8a4a-f8e8b8c55161

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42614011-9989-4274-8a4a-f8e8b8c55161
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-42614011-9989-4274-8a4a-f8e8b8c55161
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
correlation: qa-4140b1ce-1ccf-419b-a963-408da51f6f80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4140b1ce-1ccf-419b-a963-408da51f6f80
Content-Type: application/json

--- request body ---
{"handle":"qa-4eb4da1ae295","password":"****"}

--- response: 401 in 22 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4140b1ce-1ccf-419b-a963-408da51f6f80
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4140b1ce-1ccf-419b-a963-408da51f6f80"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3531fd92-b344-430b-938b-c9dd5bfb329c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3531fd92-b344-430b-938b-c9dd5bfb329c
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3531fd92-b344-430b-938b-c9dd5bfb329c
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
correlation: qa-3bfbafa5-a391-49a9-9cb1-69663a2f2feb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bfbafa5-a391-49a9-9cb1-69663a2f2feb
Content-Type: application/json

--- request body ---
{"handle":"qa-6cff13a19f4b","password":"****"}

--- response: 401 in 39 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3bfbafa5-a391-49a9-9cb1-69663a2f2feb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3bfbafa5-a391-49a9-9cb1-69663a2f2feb"}
```

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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-56efb619-968f-40de-9606-5422a9a9f846` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-febade70-100b-40c1-b62d-bc0f689c8b8b` |
| 3 | `POST /v1/auth/token` | 200 | 12 | `qa-1366cf5b-bc00-4329-81da-8551d7a15b2a` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-4559f13b-1d06-4e96-9eb6-374577579935` |
| 5 | `POST /v1/auth/token` | 400 | 33 | `qa-83966b5b-8f87-47ed-9b19-d6aa78a615d5` |
| 6 | `POST /v1/auth/token` | 200 | 46 | `qa-70ea8cd9-5200-407e-9cb3-73e1f8675210` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-1baee252-561b-4efd-b1ca-e174a14b3182` |
| 8 | `POST /v1/auth/token` | 401 | 36 | `qa-220b59da-711a-455b-9a09-aaea3d9dc8ec` |
| 9 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-65d0e3e7-ba71-46ce-9491-4e5423946db7` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-02b6e1f3-472a-4e95-8ee8-aa0b58c40673` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-56efb619-968f-40de-9606-5422a9a9f846

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56efb619-968f-40de-9606-5422a9a9f846
Content-Type: application/json

--- request body ---
{"handle":"qa-c0c500efe6ad","displayName":"QA c0c500efe6ad","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-56efb619-968f-40de-9606-5422a9a9f846
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-c0c500efe6ad
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c844e49e-a8eb-4663-8e8e-cae57511b165","handle":"qa-c0c500efe6ad","displayName":"QA c0c500efe6ad","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.613321598Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-febade70-100b-40c1-b62d-bc0f689c8b8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-febade70-100b-40c1-b62d-bc0f689c8b8b
Content-Type: application/json

--- request body ---
{"handle":"qa-e08d4de617bf","displayName":"QA e08d4de617bf","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-febade70-100b-40c1-b62d-bc0f689c8b8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 10
Location: /v1/accounts/qa-e08d4de617bf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7be01168-917c-4f8d-882e-6f342e86b6fa","handle":"qa-e08d4de617bf","displayName":"QA e08d4de617bf","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.652929800Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1366cf5b-bc00-4329-81da-8551d7a15b2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1366cf5b-bc00-4329-81da-8551d7a15b2a
Content-Type: application/json

--- request body ---
{"handle":"qa-c0c500efe6ad","password":"****"}

--- response: 200 in 12 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-1366cf5b-bc00-4329-81da-8551d7a15b2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c844e49e-a8eb-4663-8e8e-cae57511b165"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4559f13b-1d06-4e96-9eb6-374577579935

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4559f13b-1d06-4e96-9eb6-374577579935
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e08d4de617bf","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-4559f13b-1d06-4e96-9eb6-374577579935
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
Location: /v1/conversations/cnv_d54e5446-7350-4f13-a623-9e513bf6a73f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d54e5446-7350-4f13-a623-9e513bf6a73f","subject":"Error contract","status":"open","region":"eu","participants":["qa-c0c500efe6ad","qa-e08d4de617bf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:57.719736973Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-83966b5b-8f87-47ed-9b19-d6aa78a615d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83966b5b-8f87-47ed-9b19-d6aa78a615d5
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 33 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-83966b5b-8f87-47ed-9b19-d6aa78a615d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 10
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-83966b5b-8f87-47ed-9b19-d6aa78a615d5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-70ea8cd9-5200-407e-9cb3-73e1f8675210

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70ea8cd9-5200-407e-9cb3-73e1f8675210
Content-Type: application/json

--- request body ---
{"handle":"qa-e08d4de617bf","password":"****"}

--- response: 200 in 46 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-70ea8cd9-5200-407e-9cb3-73e1f8675210
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 517
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7be01168-917c-4f8d-882e-6f342e86b6fa"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1baee252-561b-4efd-b1ca-e174a14b3182

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1baee252-561b-4efd-b1ca-e174a14b3182
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1baee252-561b-4efd-b1ca-e174a14b3182
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
correlation: qa-220b59da-711a-455b-9a09-aaea3d9dc8ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-220b59da-711a-455b-9a09-aaea3d9dc8ec
Content-Type: application/json

--- request body ---
{"handle":"qa-e08d4de617bf","password":"****"}

--- response: 401 in 36 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-220b59da-711a-455b-9a09-aaea3d9dc8ec
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-220b59da-711a-455b-9a09-aaea3d9dc8ec"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-65d0e3e7-ba71-46ce-9491-4e5423946db7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65d0e3e7-ba71-46ce-9491-4e5423946db7
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-65d0e3e7-ba71-46ce-9491-4e5423946db7
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
correlation: qa-02b6e1f3-472a-4e95-8ee8-aa0b58c40673

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02b6e1f3-472a-4e95-8ee8-aa0b58c40673
Content-Type: application/json

--- request body ---
{"handle":"qa-c0c500efe6ad","password":"****"}

--- response: 401 in 24 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-02b6e1f3-472a-4e95-8ee8-aa0b58c40673
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-02b6e1f3-472a-4e95-8ee8-aa0b58c40673"}
```

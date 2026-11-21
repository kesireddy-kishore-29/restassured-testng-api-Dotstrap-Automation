# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[15]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-97a49c97-4d89-439b-97c0-6b58790fdedd` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-a807edca-f2c5-4324-b6e1-32331bf30b57` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-f4b815c8-98a9-4641-bedf-a7400d05a2fa` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-90814e36-7533-4615-93f8-bb255d2a6adc` |
| 5 | `POST /v1/credits/purchases` | 400 | 5 | `qa-9af0df44-83a0-425b-ba58-08856216d6b5` |
| 6 | `POST /v1/auth/token` | 200 | 37 | `qa-5354ad69-f70b-4b73-b87c-dbf63fefb3b5` |
| 7 | `DELETE /v1/accounts/me` | 204 | 33 | `qa-1e972c5a-d68e-4a60-ba31-101241c00bb3` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-8702cd3e-c876-4fe0-982d-97da4f4f9fac` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-f045e6a6-7326-429b-b143-27a75a30bcc6` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-4a338400-a2f5-43b7-803f-1532890247f3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-97a49c97-4d89-439b-97c0-6b58790fdedd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97a49c97-4d89-439b-97c0-6b58790fdedd
Content-Type: application/json

--- request body ---
{"handle":"qa-3b881186cab1","displayName":"QA 3b881186cab1","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-97a49c97-4d89-439b-97c0-6b58790fdedd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 7
Location: /v1/accounts/qa-3b881186cab1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_85751323-3994-4146-a957-dcc797ee215e","handle":"qa-3b881186cab1","displayName":"QA 3b881186cab1","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.727218790Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a807edca-f2c5-4324-b6e1-32331bf30b57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a807edca-f2c5-4324-b6e1-32331bf30b57
Content-Type: application/json

--- request body ---
{"handle":"qa-c2daad3ff976","displayName":"QA c2daad3ff976","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a807edca-f2c5-4324-b6e1-32331bf30b57
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 7
Location: /v1/accounts/qa-c2daad3ff976
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5464ba00-47f0-4a4d-bafe-eed0c3dd9f16","handle":"qa-c2daad3ff976","displayName":"QA c2daad3ff976","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.767491868Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f4b815c8-98a9-4641-bedf-a7400d05a2fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4b815c8-98a9-4641-bedf-a7400d05a2fa
Content-Type: application/json

--- request body ---
{"handle":"qa-3b881186cab1","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4b815c8-98a9-4641-bedf-a7400d05a2fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_85751323-3994-4146-a957-dcc797ee215e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-90814e36-7533-4615-93f8-bb255d2a6adc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90814e36-7533-4615-93f8-bb255d2a6adc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c2daad3ff976","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-90814e36-7533-4615-93f8-bb255d2a6adc
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
Location: /v1/conversations/cnv_10a8448d-9200-4b6e-b63a-f594378915d3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_10a8448d-9200-4b6e-b63a-f594378915d3","subject":"Error contract","status":"open","region":"eu","participants":["qa-3b881186cab1","qa-c2daad3ff976"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:52.828587820Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9af0df44-83a0-425b-ba58-08856216d6b5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c800d64e6ce94838b1b849758884ca76
X-Correlation-Id: qa-9af0df44-83a0-425b-ba58-08856216d6b5
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9af0df44-83a0-425b-ba58-08856216d6b5
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
Content-Length: 262

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-9af0df44-83a0-425b-ba58-08856216d6b5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5354ad69-f70b-4b73-b87c-dbf63fefb3b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5354ad69-f70b-4b73-b87c-dbf63fefb3b5
Content-Type: application/json

--- request body ---
{"handle":"qa-c2daad3ff976","password":"****"}

--- response: 200 in 37 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-5354ad69-f70b-4b73-b87c-dbf63fefb3b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5464ba00-47f0-4a4d-bafe-eed0c3dd9f16"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1e972c5a-d68e-4a60-ba31-101241c00bb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e972c5a-d68e-4a60-ba31-101241c00bb3
Content-Type: application/json

--- response: 204 in 33 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1e972c5a-d68e-4a60-ba31-101241c00bb3
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
correlation: qa-8702cd3e-c876-4fe0-982d-97da4f4f9fac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8702cd3e-c876-4fe0-982d-97da4f4f9fac
Content-Type: application/json

--- request body ---
{"handle":"qa-c2daad3ff976","password":"****"}

--- response: 401 in 20 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8702cd3e-c876-4fe0-982d-97da4f4f9fac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8702cd3e-c876-4fe0-982d-97da4f4f9fac"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f045e6a6-7326-429b-b143-27a75a30bcc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f045e6a6-7326-429b-b143-27a75a30bcc6
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f045e6a6-7326-429b-b143-27a75a30bcc6
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
correlation: qa-4a338400-a2f5-43b7-803f-1532890247f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a338400-a2f5-43b7-803f-1532890247f3
Content-Type: application/json

--- request body ---
{"handle":"qa-3b881186cab1","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4a338400-a2f5-43b7-803f-1532890247f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4a338400-a2f5-43b7-803f-1532890247f3"}
```

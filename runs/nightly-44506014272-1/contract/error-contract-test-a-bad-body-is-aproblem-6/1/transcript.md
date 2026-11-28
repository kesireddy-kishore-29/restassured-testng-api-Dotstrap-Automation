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
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-8ba2f285-b57a-449f-84ef-53451c0d1c72` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-880a7b07-31c2-4563-bcfc-781483a9fc18` |
| 3 | `POST /v1/auth/token` | 200 | 52 | `qa-f9cf1a11-23e6-4b8f-8f2a-1b4c757221ad` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-ce4976ed-4959-4bb3-9cba-5b770f71c1f2` |
| 5 | `PATCH /v1/accounts/me` | 400 | 16 | `qa-c4b11ddd-3323-4c93-ad56-eecc462f2172` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-d0ce00aa-315b-435d-a529-826b6ec7cf0c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-a882c421-8768-4d7e-ab54-ec966ecaaee9` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-588aabed-c568-42ef-97ea-1ef4653596b8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-9ce8f3be-efee-4916-857d-e5ccc695eab2` |
| 10 | `POST /v1/auth/token` | 401 | 35 | `qa-53d48536-f12b-45e9-94a5-215bfdd69ad2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8ba2f285-b57a-449f-84ef-53451c0d1c72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ba2f285-b57a-449f-84ef-53451c0d1c72
Content-Type: application/json

--- request body ---
{"handle":"qa-e42e9fc1aae1","displayName":"QA e42e9fc1aae1","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ba2f285-b57a-449f-84ef-53451c0d1c72
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 7
Location: /v1/accounts/qa-e42e9fc1aae1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_52c74845-e31a-4cc8-aa4d-6550757697ea","handle":"qa-e42e9fc1aae1","displayName":"QA e42e9fc1aae1","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.348409426Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-880a7b07-31c2-4563-bcfc-781483a9fc18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-880a7b07-31c2-4563-bcfc-781483a9fc18
Content-Type: application/json

--- request body ---
{"handle":"qa-7e5266f5298b","displayName":"QA 7e5266f5298b","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-880a7b07-31c2-4563-bcfc-781483a9fc18
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 7
Location: /v1/accounts/qa-7e5266f5298b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6769c744-cc19-4d12-823f-c3b74acc776e","handle":"qa-7e5266f5298b","displayName":"QA 7e5266f5298b","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.415952868Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f9cf1a11-23e6-4b8f-8f2a-1b4c757221ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9cf1a11-23e6-4b8f-8f2a-1b4c757221ad
Content-Type: application/json

--- request body ---
{"handle":"qa-e42e9fc1aae1","password":"****"}

--- response: 200 in 52 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9cf1a11-23e6-4b8f-8f2a-1b4c757221ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_52c74845-e31a-4cc8-aa4d-6550757697ea"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ce4976ed-4959-4bb3-9cba-5b770f71c1f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce4976ed-4959-4bb3-9cba-5b770f71c1f2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7e5266f5298b","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce4976ed-4959-4bb3-9cba-5b770f71c1f2
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
Location: /v1/conversations/cnv_1aa31f03-d809-4969-8c98-2c12f95466f4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1aa31f03-d809-4969-8c98-2c12f95466f4","subject":"Error contract","status":"open","region":"eu","participants":["qa-e42e9fc1aae1","qa-7e5266f5298b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:25.534442197Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-c4b11ddd-3323-4c93-ad56-eecc462f2172

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4b11ddd-3323-4c93-ad56-eecc462f2172
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 16 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c4b11ddd-3323-4c93-ad56-eecc462f2172
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-c4b11ddd-3323-4c93-ad56-eecc462f2172"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d0ce00aa-315b-435d-a529-826b6ec7cf0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0ce00aa-315b-435d-a529-826b6ec7cf0c
Content-Type: application/json

--- request body ---
{"handle":"qa-7e5266f5298b","password":"****"}

--- response: 200 in 19 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0ce00aa-315b-435d-a529-826b6ec7cf0c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6769c744-cc19-4d12-823f-c3b74acc776e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a882c421-8768-4d7e-ab54-ec966ecaaee9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a882c421-8768-4d7e-ab54-ec966ecaaee9
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a882c421-8768-4d7e-ab54-ec966ecaaee9
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
correlation: qa-588aabed-c568-42ef-97ea-1ef4653596b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-588aabed-c568-42ef-97ea-1ef4653596b8
Content-Type: application/json

--- request body ---
{"handle":"qa-7e5266f5298b","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-588aabed-c568-42ef-97ea-1ef4653596b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-588aabed-c568-42ef-97ea-1ef4653596b8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9ce8f3be-efee-4916-857d-e5ccc695eab2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ce8f3be-efee-4916-857d-e5ccc695eab2
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9ce8f3be-efee-4916-857d-e5ccc695eab2
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
correlation: qa-53d48536-f12b-45e9-94a5-215bfdd69ad2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53d48536-f12b-45e9-94a5-215bfdd69ad2
Content-Type: application/json

--- request body ---
{"handle":"qa-e42e9fc1aae1","password":"****"}

--- response: 401 in 35 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-53d48536-f12b-45e9-94a5-215bfdd69ad2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-53d48536-f12b-45e9-94a5-215bfdd69ad2"}
```

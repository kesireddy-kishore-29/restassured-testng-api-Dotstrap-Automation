# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-12021b73-e92a-4fe9-ad56-8fb90eb56cee` |
| 2 | `POST /v1/accounts` | 201 | 75 | `qa-fe047f00-8e6b-411d-b660-0c4441663f23` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-d8d6ec13-4312-40de-9f15-4fcf70d8ee02` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-9a756f4c-12c4-4b6c-820f-5e5b766c5b20` |
| 5 | `POST /v1/accounts` | 400 | 17 | `qa-58b2f92d-d5a3-4bb0-8ac1-c3150df775c5` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-0565863a-c119-4a8e-a289-418f90685001` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-e54b24a9-86c6-4693-bde9-3ed34bdef0bd` |
| 8 | `POST /v1/auth/token` | 401 | 34 | `qa-41616521-bbd1-450d-a446-329813002a58` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-6065da54-a2f8-4191-a159-c2544c759331` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-d5b70763-cd79-4400-a30b-785d19144f31` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-12021b73-e92a-4fe9-ad56-8fb90eb56cee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12021b73-e92a-4fe9-ad56-8fb90eb56cee
Content-Type: application/json

--- request body ---
{"handle":"qa-8afd2d998569","displayName":"QA 8afd2d998569","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-12021b73-e92a-4fe9-ad56-8fb90eb56cee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Location: /v1/accounts/qa-8afd2d998569
X-Served-Region: eu
Content-Length: 181

{"id":"acc_85ca0e5c-88ea-4aca-8e07-86089f1d30db","handle":"qa-8afd2d998569","displayName":"QA 8afd2d998569","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.132289950Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fe047f00-8e6b-411d-b660-0c4441663f23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe047f00-8e6b-411d-b660-0c4441663f23
Content-Type: application/json

--- request body ---
{"handle":"qa-5fa0871c9d5a","displayName":"QA 5fa0871c9d5a","password":"****","region":"eu"}

--- response: 201 in 75 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe047f00-8e6b-411d-b660-0c4441663f23
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 10
Location: /v1/accounts/qa-5fa0871c9d5a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_87d01862-d24a-4403-9866-180b1382b531","handle":"qa-5fa0871c9d5a","displayName":"QA 5fa0871c9d5a","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.215547766Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d8d6ec13-4312-40de-9f15-4fcf70d8ee02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8d6ec13-4312-40de-9f15-4fcf70d8ee02
Content-Type: application/json

--- request body ---
{"handle":"qa-8afd2d998569","password":"****"}

--- response: 200 in 23 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8d6ec13-4312-40de-9f15-4fcf70d8ee02
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_85ca0e5c-88ea-4aca-8e07-86089f1d30db"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9a756f4c-12c4-4b6c-820f-5e5b766c5b20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a756f4c-12c4-4b6c-820f-5e5b766c5b20
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5fa0871c9d5a","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a756f4c-12c4-4b6c-820f-5e5b766c5b20
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
Location: /v1/conversations/cnv_0e64f238-9c72-435d-a577-4aeb4f136433
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0e64f238-9c72-435d-a577-4aeb4f136433","subject":"Error contract","status":"open","region":"eu","participants":["qa-8afd2d998569","qa-5fa0871c9d5a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:57.264362589Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-58b2f92d-d5a3-4bb0-8ac1-c3150df775c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58b2f92d-d5a3-4bb0-8ac1-c3150df775c5
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 17 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-58b2f92d-d5a3-4bb0-8ac1-c3150df775c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 9
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-58b2f92d-d5a3-4bb0-8ac1-c3150df775c5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0565863a-c119-4a8e-a289-418f90685001

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0565863a-c119-4a8e-a289-418f90685001
Content-Type: application/json

--- request body ---
{"handle":"qa-5fa0871c9d5a","password":"****"}

--- response: 200 in 39 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-0565863a-c119-4a8e-a289-418f90685001
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_87d01862-d24a-4403-9866-180b1382b531"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e54b24a9-86c6-4693-bde9-3ed34bdef0bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e54b24a9-86c6-4693-bde9-3ed34bdef0bd
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e54b24a9-86c6-4693-bde9-3ed34bdef0bd
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
correlation: qa-41616521-bbd1-450d-a446-329813002a58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41616521-bbd1-450d-a446-329813002a58
Content-Type: application/json

--- request body ---
{"handle":"qa-5fa0871c9d5a","password":"****"}

--- response: 401 in 34 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-41616521-bbd1-450d-a446-329813002a58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-41616521-bbd1-450d-a446-329813002a58"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6065da54-a2f8-4191-a159-c2544c759331

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6065da54-a2f8-4191-a159-c2544c759331
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6065da54-a2f8-4191-a159-c2544c759331
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
correlation: qa-d5b70763-cd79-4400-a30b-785d19144f31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5b70763-cd79-4400-a30b-785d19144f31
Content-Type: application/json

--- request body ---
{"handle":"qa-8afd2d998569","password":"****"}

--- response: 401 in 21 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d5b70763-cd79-4400-a30b-785d19144f31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d5b70763-cd79-4400-a30b-785d19144f31"}
```

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
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-71e792fa-ac5a-4278-aaf2-aa3e7ef2182a` |
| 2 | `POST /v1/accounts` | 201 | 50 | `qa-71a94588-4573-4ff1-838b-4f83ba35569f` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-ad507024-d1c4-4320-adb2-83c5b6c982f6` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-198229a1-778b-44eb-85ea-3f0b4bcdd924` |
| 5 | `POST /v1/accounts` | 400 | 14 | `qa-cbe06544-c633-4666-a44e-cd022f8e3c60` |
| 6 | `POST /v1/auth/token` | 200 | 68 | `qa-44ae2ff2-38e9-43ea-aaaa-708850976e84` |
| 7 | `DELETE /v1/accounts/me` | 204 | 80 | `qa-3151fb4f-82f3-4461-84ab-09430b1ec0a6` |
| 8 | `POST /v1/auth/token` | 401 | 33 | `qa-b0f361c0-8ef0-49cb-a377-6e17bafba980` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-3380d28b-1783-4405-b10c-f009f202de07` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-bab38d10-194c-47f9-b587-4d256d9c0398` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-71e792fa-ac5a-4278-aaf2-aa3e7ef2182a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71e792fa-ac5a-4278-aaf2-aa3e7ef2182a
Content-Type: application/json

--- request body ---
{"handle":"qa-d478b160b498","displayName":"QA d478b160b498","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-71e792fa-ac5a-4278-aaf2-aa3e7ef2182a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 10
Location: /v1/accounts/qa-d478b160b498
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0fcbea89-71c0-4866-badb-11ecb576a262","handle":"qa-d478b160b498","displayName":"QA d478b160b498","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.093411840Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-71a94588-4573-4ff1-838b-4f83ba35569f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71a94588-4573-4ff1-838b-4f83ba35569f
Content-Type: application/json

--- request body ---
{"handle":"qa-8c06cf873606","displayName":"QA 8c06cf873606","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-71a94588-4573-4ff1-838b-4f83ba35569f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 10
Location: /v1/accounts/qa-8c06cf873606
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4b0059f0-9992-426e-b6d8-2d69f931e1c9","handle":"qa-8c06cf873606","displayName":"QA 8c06cf873606","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.161201232Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ad507024-d1c4-4320-adb2-83c5b6c982f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad507024-d1c4-4320-adb2-83c5b6c982f6
Content-Type: application/json

--- request body ---
{"handle":"qa-d478b160b498","password":"****"}

--- response: 200 in 32 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad507024-d1c4-4320-adb2-83c5b6c982f6
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0fcbea89-71c0-4866-badb-11ecb576a262"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-198229a1-778b-44eb-85ea-3f0b4bcdd924

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-198229a1-778b-44eb-85ea-3f0b4bcdd924
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8c06cf873606","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-198229a1-778b-44eb-85ea-3f0b4bcdd924
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
Location: /v1/conversations/cnv_160bd430-d0bd-4c13-ae61-d6e1574a81ff
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_160bd430-d0bd-4c13-ae61-d6e1574a81ff","subject":"Error contract","status":"open","region":"eu","participants":["qa-d478b160b498","qa-8c06cf873606"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:08.234098838Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-cbe06544-c633-4666-a44e-cd022f8e3c60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbe06544-c633-4666-a44e-cd022f8e3c60
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cbe06544-c633-4666-a44e-cd022f8e3c60
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 9
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-cbe06544-c633-4666-a44e-cd022f8e3c60"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-44ae2ff2-38e9-43ea-aaaa-708850976e84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44ae2ff2-38e9-43ea-aaaa-708850976e84
Content-Type: application/json

--- request body ---
{"handle":"qa-8c06cf873606","password":"****"}

--- response: 200 in 68 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-44ae2ff2-38e9-43ea-aaaa-708850976e84
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4b0059f0-9992-426e-b6d8-2d69f931e1c9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3151fb4f-82f3-4461-84ab-09430b1ec0a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3151fb4f-82f3-4461-84ab-09430b1ec0a6
Content-Type: application/json

--- response: 204 in 80 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3151fb4f-82f3-4461-84ab-09430b1ec0a6
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
correlation: qa-b0f361c0-8ef0-49cb-a377-6e17bafba980

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0f361c0-8ef0-49cb-a377-6e17bafba980
Content-Type: application/json

--- request body ---
{"handle":"qa-8c06cf873606","password":"****"}

--- response: 401 in 33 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b0f361c0-8ef0-49cb-a377-6e17bafba980
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b0f361c0-8ef0-49cb-a377-6e17bafba980"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3380d28b-1783-4405-b10c-f009f202de07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3380d28b-1783-4405-b10c-f009f202de07
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3380d28b-1783-4405-b10c-f009f202de07
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
correlation: qa-bab38d10-194c-47f9-b587-4d256d9c0398

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bab38d10-194c-47f9-b587-4d256d9c0398
Content-Type: application/json

--- request body ---
{"handle":"qa-d478b160b498","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bab38d10-194c-47f9-b587-4d256d9c0398
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bab38d10-194c-47f9-b587-4d256d9c0398"}
```

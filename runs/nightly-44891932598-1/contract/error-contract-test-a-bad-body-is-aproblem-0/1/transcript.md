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
| 1 | `POST /v1/accounts` | 201 | 48 | `qa-7c536a62-578c-4dae-b479-f7627cab57c5` |
| 2 | `POST /v1/accounts` | 201 | 53 | `qa-b18d6b76-4e47-4b88-be4b-51a038cffa7b` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-2d2ec6c1-f4d5-4f70-83d3-9b40c6f59552` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-df44b932-1ab6-486f-a13a-b799091e4c42` |
| 5 | `POST /v1/auth/token` | 400 | 23 | `qa-dda412cb-2de0-4afe-844a-c5037967a271` |
| 6 | `POST /v1/auth/token` | 200 | 60 | `qa-466aeab7-e5a3-4a51-9e7a-272e3c6660ec` |
| 7 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-844be712-6bd6-49f7-af06-de3d4818a7d9` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-c508b041-0668-4b6e-866c-a9e26d6790e5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 57 | `qa-2f95c918-a97a-4433-951f-b64e91586f74` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-4b9cc5f4-cddf-4eeb-aff2-7a3fddb86e45` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7c536a62-578c-4dae-b479-f7627cab57c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c536a62-578c-4dae-b479-f7627cab57c5
Content-Type: application/json

--- request body ---
{"handle":"qa-e90efe8f098d","displayName":"QA e90efe8f098d","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c536a62-578c-4dae-b479-f7627cab57c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Location: /v1/accounts/qa-e90efe8f098d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_22f738fd-de55-4021-9b1c-855b45ab86b3","handle":"qa-e90efe8f098d","displayName":"QA e90efe8f098d","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.065185360Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b18d6b76-4e47-4b88-be4b-51a038cffa7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b18d6b76-4e47-4b88-be4b-51a038cffa7b
Content-Type: application/json

--- request body ---
{"handle":"qa-b098f0bdf204","displayName":"QA b098f0bdf204","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-b18d6b76-4e47-4b88-be4b-51a038cffa7b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Location: /v1/accounts/qa-b098f0bdf204
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dda5d82a-25a0-4a16-ab83-20dc1a46d14b","handle":"qa-b098f0bdf204","displayName":"QA b098f0bdf204","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.146984742Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2d2ec6c1-f4d5-4f70-83d3-9b40c6f59552

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d2ec6c1-f4d5-4f70-83d3-9b40c6f59552
Content-Type: application/json

--- request body ---
{"handle":"qa-e90efe8f098d","password":"****"}

--- response: 200 in 27 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d2ec6c1-f4d5-4f70-83d3-9b40c6f59552
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_22f738fd-de55-4021-9b1c-855b45ab86b3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-df44b932-1ab6-486f-a13a-b799091e4c42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df44b932-1ab6-486f-a13a-b799091e4c42
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b098f0bdf204","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-df44b932-1ab6-486f-a13a-b799091e4c42
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
Location: /v1/conversations/cnv_eb179cdd-4abf-4a97-81db-de9deb29fd78
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_eb179cdd-4abf-4a97-81db-de9deb29fd78","subject":"Error contract","status":"open","region":"eu","participants":["qa-e90efe8f098d","qa-b098f0bdf204"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:09.229113567Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-dda412cb-2de0-4afe-844a-c5037967a271

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dda412cb-2de0-4afe-844a-c5037967a271
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 23 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dda412cb-2de0-4afe-844a-c5037967a271
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 9
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-dda412cb-2de0-4afe-844a-c5037967a271"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-466aeab7-e5a3-4a51-9e7a-272e3c6660ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-466aeab7-e5a3-4a51-9e7a-272e3c6660ec
Content-Type: application/json

--- request body ---
{"handle":"qa-b098f0bdf204","password":"****"}

--- response: 200 in 60 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-466aeab7-e5a3-4a51-9e7a-272e3c6660ec
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dda5d82a-25a0-4a16-ab83-20dc1a46d14b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-844be712-6bd6-49f7-af06-de3d4818a7d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-844be712-6bd6-49f7-af06-de3d4818a7d9
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-844be712-6bd6-49f7-af06-de3d4818a7d9
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
correlation: qa-c508b041-0668-4b6e-866c-a9e26d6790e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c508b041-0668-4b6e-866c-a9e26d6790e5
Content-Type: application/json

--- request body ---
{"handle":"qa-b098f0bdf204","password":"****"}

--- response: 401 in 24 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c508b041-0668-4b6e-866c-a9e26d6790e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c508b041-0668-4b6e-866c-a9e26d6790e5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2f95c918-a97a-4433-951f-b64e91586f74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f95c918-a97a-4433-951f-b64e91586f74
Content-Type: application/json

--- response: 204 in 57 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2f95c918-a97a-4433-951f-b64e91586f74
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
correlation: qa-4b9cc5f4-cddf-4eeb-aff2-7a3fddb86e45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b9cc5f4-cddf-4eeb-aff2-7a3fddb86e45
Content-Type: application/json

--- request body ---
{"handle":"qa-e90efe8f098d","password":"****"}

--- response: 401 in 24 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4b9cc5f4-cddf-4eeb-aff2-7a3fddb86e45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 486
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4b9cc5f4-cddf-4eeb-aff2-7a3fddb86e45"}
```

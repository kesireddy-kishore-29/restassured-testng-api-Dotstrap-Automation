# Transcript: Every operation answers an outage with a 503 problem and Retry-After [DELETE /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[4]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-5d411255-2fd3-4c4e-9656-6bf68bb94860` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-91849a0e-42ec-4e90-9123-47b61bd4ad25` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-9343b10a-f627-4c5e-902a-2db8407f16a6` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-4cf6bbd3-b99c-493b-8148-b77a18bfba79` |
| 5 | `DELETE /v1/accounts/me` | 503 | 15 | `qa-e9b8782b-a4b7-4d6f-9e88-7b2912d4916b` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-5117703e-bf63-4c19-bbcc-3db57ed89124` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-ea158cb7-c721-4665-b9a0-7e8995e5c759` |
| 8 | `POST /v1/auth/token` | 401 | 31 | `qa-3857c68a-22c1-49b4-ae9f-38bdff43afba` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-e2867646-7170-4948-a143-70129b664eb1` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-ce966eb8-1a02-42f6-9832-95601c0c6b2c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5d411255-2fd3-4c4e-9656-6bf68bb94860

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d411255-2fd3-4c4e-9656-6bf68bb94860
Content-Type: application/json

--- request body ---
{"handle":"qa-fe308cb4dee2","displayName":"QA fe308cb4dee2","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d411255-2fd3-4c4e-9656-6bf68bb94860
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 9
Location: /v1/accounts/qa-fe308cb4dee2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39e974b1-34a7-4a5f-8e8a-caf75e3a0bf4","handle":"qa-fe308cb4dee2","displayName":"QA fe308cb4dee2","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.078836373Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-91849a0e-42ec-4e90-9123-47b61bd4ad25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91849a0e-42ec-4e90-9123-47b61bd4ad25
Content-Type: application/json

--- request body ---
{"handle":"qa-115a6c02591e","displayName":"QA 115a6c02591e","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-91849a0e-42ec-4e90-9123-47b61bd4ad25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 9
Location: /v1/accounts/qa-115a6c02591e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2a52c405-4560-41cc-a7f6-0e6844ecac24","handle":"qa-115a6c02591e","displayName":"QA 115a6c02591e","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.129023891Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9343b10a-f627-4c5e-902a-2db8407f16a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9343b10a-f627-4c5e-902a-2db8407f16a6
Content-Type: application/json

--- request body ---
{"handle":"qa-fe308cb4dee2","password":"****"}

--- response: 200 in 43 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-9343b10a-f627-4c5e-902a-2db8407f16a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_39e974b1-34a7-4a5f-8e8a-caf75e3a0bf4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4cf6bbd3-b99c-493b-8148-b77a18bfba79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cf6bbd3-b99c-493b-8148-b77a18bfba79
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-115a6c02591e","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cf6bbd3-b99c-493b-8148-b77a18bfba79
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
Location: /v1/conversations/cnv_109041da-36ca-4a71-ab57-44a31823de50
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_109041da-36ca-4a71-ab57-44a31823de50","subject":"Error contract","status":"open","region":"eu","participants":["qa-fe308cb4dee2","qa-115a6c02591e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:31.239556121Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e9b8782b-a4b7-4d6f-9e88-7b2912d4916b

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 17927d7b-77f7-4348-b5e5-3efc82b09e10
X-Correlation-Id: qa-e9b8782b-a4b7-4d6f-9e88-7b2912d4916b
Content-Type: application/json

--- response: 503 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e9b8782b-a4b7-4d6f-9e88-7b2912d4916b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-e9b8782b-a4b7-4d6f-9e88-7b2912d4916b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5117703e-bf63-4c19-bbcc-3db57ed89124

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5117703e-bf63-4c19-bbcc-3db57ed89124
Content-Type: application/json

--- request body ---
{"handle":"qa-115a6c02591e","password":"****"}

--- response: 200 in 28 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-5117703e-bf63-4c19-bbcc-3db57ed89124
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2a52c405-4560-41cc-a7f6-0e6844ecac24"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ea158cb7-c721-4665-b9a0-7e8995e5c759

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea158cb7-c721-4665-b9a0-7e8995e5c759
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ea158cb7-c721-4665-b9a0-7e8995e5c759
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
correlation: qa-3857c68a-22c1-49b4-ae9f-38bdff43afba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3857c68a-22c1-49b4-ae9f-38bdff43afba
Content-Type: application/json

--- request body ---
{"handle":"qa-115a6c02591e","password":"****"}

--- response: 401 in 31 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3857c68a-22c1-49b4-ae9f-38bdff43afba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3857c68a-22c1-49b4-ae9f-38bdff43afba"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e2867646-7170-4948-a143-70129b664eb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2867646-7170-4948-a143-70129b664eb1
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e2867646-7170-4948-a143-70129b664eb1
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
correlation: qa-ce966eb8-1a02-42f6-9832-95601c0c6b2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce966eb8-1a02-42f6-9832-95601c0c6b2c
Content-Type: application/json

--- request body ---
{"handle":"qa-fe308cb4dee2","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce966eb8-1a02-42f6-9832-95601c0c6b2c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ce966eb8-1a02-42f6-9832-95601c0c6b2c"}
```

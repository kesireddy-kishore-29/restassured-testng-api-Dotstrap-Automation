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
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-91c3c29e-120b-43e7-8bd1-acf649612a64` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-00c83ac0-ddd1-4dfd-839c-7c62c40f0d5a` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-3edb504d-046b-4aa2-a194-bd27c506dd6f` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-2ab7befc-56a2-401d-8d78-a7487147642b` |
| 5 | `POST /v1/accounts` | 400 | 20 | `qa-29074ebe-95e0-4fac-81b6-a6f43d20033b` |
| 6 | `POST /v1/auth/token` | 200 | 58 | `qa-838f7af6-169a-47a9-9717-d82afbe81352` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-936e33fb-8d18-440f-a635-35a2dd903026` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-1eeb73ed-16b5-4a49-9a29-186da22f754f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-b5d4c88e-b64a-4050-bbbd-9e912c79ce3a` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-39c13bb4-8556-467a-8832-6325418b6ae5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-91c3c29e-120b-43e7-8bd1-acf649612a64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91c3c29e-120b-43e7-8bd1-acf649612a64
Content-Type: application/json

--- request body ---
{"handle":"qa-f071d47f2739","displayName":"QA f071d47f2739","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-91c3c29e-120b-43e7-8bd1-acf649612a64
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
Location: /v1/accounts/qa-f071d47f2739
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4ea1b7ee-8436-4383-b1d6-8deefabd345d","handle":"qa-f071d47f2739","displayName":"QA f071d47f2739","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.095881250Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-00c83ac0-ddd1-4dfd-839c-7c62c40f0d5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00c83ac0-ddd1-4dfd-839c-7c62c40f0d5a
Content-Type: application/json

--- request body ---
{"handle":"qa-24d07c77a183","displayName":"QA 24d07c77a183","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-00c83ac0-ddd1-4dfd-839c-7c62c40f0d5a
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
Location: /v1/accounts/qa-24d07c77a183
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f81fcc1f-9b78-46f5-9271-9c426a5748d9","handle":"qa-24d07c77a183","displayName":"QA 24d07c77a183","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.144953952Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3edb504d-046b-4aa2-a194-bd27c506dd6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3edb504d-046b-4aa2-a194-bd27c506dd6f
Content-Type: application/json

--- request body ---
{"handle":"qa-f071d47f2739","password":"****"}

--- response: 200 in 27 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-3edb504d-046b-4aa2-a194-bd27c506dd6f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4ea1b7ee-8436-4383-b1d6-8deefabd345d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2ab7befc-56a2-401d-8d78-a7487147642b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ab7befc-56a2-401d-8d78-a7487147642b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-24d07c77a183","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ab7befc-56a2-401d-8d78-a7487147642b
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
Location: /v1/conversations/cnv_57911ca5-4207-4f65-89f3-8c85f44b5c4e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_57911ca5-4207-4f65-89f3-8c85f44b5c4e","subject":"Error contract","status":"open","region":"eu","participants":["qa-f071d47f2739","qa-24d07c77a183"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:35.206976393Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-29074ebe-95e0-4fac-81b6-a6f43d20033b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29074ebe-95e0-4fac-81b6-a6f43d20033b
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 20 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-29074ebe-95e0-4fac-81b6-a6f43d20033b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 9
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-29074ebe-95e0-4fac-81b6-a6f43d20033b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-838f7af6-169a-47a9-9717-d82afbe81352

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-838f7af6-169a-47a9-9717-d82afbe81352
Content-Type: application/json

--- request body ---
{"handle":"qa-24d07c77a183","password":"****"}

--- response: 200 in 58 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-838f7af6-169a-47a9-9717-d82afbe81352
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f81fcc1f-9b78-46f5-9271-9c426a5748d9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-936e33fb-8d18-440f-a635-35a2dd903026

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-936e33fb-8d18-440f-a635-35a2dd903026
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-936e33fb-8d18-440f-a635-35a2dd903026
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
correlation: qa-1eeb73ed-16b5-4a49-9a29-186da22f754f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1eeb73ed-16b5-4a49-9a29-186da22f754f
Content-Type: application/json

--- request body ---
{"handle":"qa-24d07c77a183","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1eeb73ed-16b5-4a49-9a29-186da22f754f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1eeb73ed-16b5-4a49-9a29-186da22f754f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b5d4c88e-b64a-4050-bbbd-9e912c79ce3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5d4c88e-b64a-4050-bbbd-9e912c79ce3a
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b5d4c88e-b64a-4050-bbbd-9e912c79ce3a
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
correlation: qa-39c13bb4-8556-467a-8832-6325418b6ae5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39c13bb4-8556-467a-8832-6325418b6ae5
Content-Type: application/json

--- request body ---
{"handle":"qa-f071d47f2739","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-39c13bb4-8556-467a-8832-6325418b6ae5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-39c13bb4-8556-467a-8832-6325418b6ae5"}
```

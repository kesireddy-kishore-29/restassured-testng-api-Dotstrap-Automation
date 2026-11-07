# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/auth/token]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[0]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 440 | `qa-f955bc68-a253-4b3a-995e-f19f44f4e84a` |
| 2 | `POST /v1/accounts` | 201 | 55 | `qa-e57e7471-c39a-4ae2-bc87-c9ab2d7303e1` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-ec551ec7-fa79-4429-91f1-1f466a177bf6` |
| 4 | `POST /v1/conversations` | 201 | 42 | `qa-3bcc7b32-d187-4a2a-92f4-2c0d495f8af6` |
| 5 | `POST /v1/auth/token` | 503 | 15 | `qa-dda53563-c164-479b-8823-fe27cf1125fd` |
| 6 | `POST /v1/auth/token` | 200 | 43 | `qa-0ecdf808-f232-42b7-929a-2b26b7309614` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-46d19c26-9d58-4176-9b24-57fd627acf46` |
| 8 | `POST /v1/auth/token` | 401 | 25 | `qa-2b1c963e-65d2-4ab4-a284-cedef8583cd1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 33 | `qa-43419e56-08d6-48f5-8f84-a2e9c50b5d41` |
| 10 | `POST /v1/auth/token` | 401 | 52 | `qa-a01e236a-68df-4485-8d0a-7955aae9ebec` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f955bc68-a253-4b3a-995e-f19f44f4e84a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f955bc68-a253-4b3a-995e-f19f44f4e84a
Content-Type: application/json

--- request body ---
{"handle":"qa-acb1fbe74389","displayName":"QA acb1fbe74389","password":"****","region":"eu"}

--- response: 201 in 440 ms ---
Date: Mon, 02 Nov 2026 09:38:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-f955bc68-a253-4b3a-995e-f19f44f4e84a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Location: /v1/accounts/qa-acb1fbe74389
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4abaa363-dfee-4099-899e-350a288e6057","handle":"qa-acb1fbe74389","displayName":"QA acb1fbe74389","region":"eu","role":"user","createdAt":"2026-11-02T09:38:34.722931378Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e57e7471-c39a-4ae2-bc87-c9ab2d7303e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e57e7471-c39a-4ae2-bc87-c9ab2d7303e1
Content-Type: application/json

--- request body ---
{"handle":"qa-a9b9cbf4d899","displayName":"QA a9b9cbf4d899","password":"****","region":"eu"}

--- response: 201 in 55 ms ---
Date: Mon, 02 Nov 2026 09:38:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-e57e7471-c39a-4ae2-bc87-c9ab2d7303e1
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
Location: /v1/accounts/qa-a9b9cbf4d899
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1b822d19-eb1c-47e6-833d-85dcc22d8e2f","handle":"qa-a9b9cbf4d899","displayName":"QA a9b9cbf4d899","region":"eu","role":"user","createdAt":"2026-11-02T09:38:34.988842831Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ec551ec7-fa79-4429-91f1-1f466a177bf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec551ec7-fa79-4429-91f1-1f466a177bf6
Content-Type: application/json

--- request body ---
{"handle":"qa-acb1fbe74389","password":"****"}

--- response: 200 in 46 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec551ec7-fa79-4429-91f1-1f466a177bf6
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4abaa363-dfee-4099-899e-350a288e6057"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3bcc7b32-d187-4a2a-92f4-2c0d495f8af6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bcc7b32-d187-4a2a-92f4-2c0d495f8af6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a9b9cbf4d899","subject":"Error contract","message":"Hi"}

--- response: 201 in 42 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-3bcc7b32-d187-4a2a-92f4-2c0d495f8af6
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
Location: /v1/conversations/cnv_86598230-431d-4f38-a2c5-46ec4820b5ef
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_86598230-431d-4f38-a2c5-46ec4820b5ef","subject":"Error contract","status":"open","region":"eu","participants":["qa-acb1fbe74389","qa-a9b9cbf4d899"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:35.181707715Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-dda53563-c164-479b-8823-fe27cf1125fd

--- request headers ---
Accept: application/json
X-Fault-Key: 24e9b43c-7a83-4134-aeaf-ff42ead19f1a
X-Fault: unavailable-once
X-Correlation-Id: qa-dda53563-c164-479b-8823-fe27cf1125fd
Content-Type: application/json

--- request body ---
{"handle":"qa-acb1fbe74389","password":"****"}

--- response: 503 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dda53563-c164-479b-8823-fe27cf1125fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-dda53563-c164-479b-8823-fe27cf1125fd"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0ecdf808-f232-42b7-929a-2b26b7309614

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ecdf808-f232-42b7-929a-2b26b7309614
Content-Type: application/json

--- request body ---
{"handle":"qa-a9b9cbf4d899","password":"****"}

--- response: 200 in 43 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ecdf808-f232-42b7-929a-2b26b7309614
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1b822d19-eb1c-47e6-833d-85dcc22d8e2f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-46d19c26-9d58-4176-9b24-57fd627acf46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46d19c26-9d58-4176-9b24-57fd627acf46
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-46d19c26-9d58-4176-9b24-57fd627acf46
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
correlation: qa-2b1c963e-65d2-4ab4-a284-cedef8583cd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b1c963e-65d2-4ab4-a284-cedef8583cd1
Content-Type: application/json

--- request body ---
{"handle":"qa-a9b9cbf4d899","password":"****"}

--- response: 401 in 25 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2b1c963e-65d2-4ab4-a284-cedef8583cd1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2b1c963e-65d2-4ab4-a284-cedef8583cd1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-43419e56-08d6-48f5-8f84-a2e9c50b5d41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43419e56-08d6-48f5-8f84-a2e9c50b5d41
Content-Type: application/json

--- response: 204 in 33 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-43419e56-08d6-48f5-8f84-a2e9c50b5d41
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
correlation: qa-a01e236a-68df-4485-8d0a-7955aae9ebec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a01e236a-68df-4485-8d0a-7955aae9ebec
Content-Type: application/json

--- request body ---
{"handle":"qa-acb1fbe74389","password":"****"}

--- response: 401 in 52 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a01e236a-68df-4485-8d0a-7955aae9ebec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 516
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a01e236a-68df-4485-8d0a-7955aae9ebec"}
```

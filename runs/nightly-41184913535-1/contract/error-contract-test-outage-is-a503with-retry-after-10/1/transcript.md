# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-30c19720-b18f-437f-b7d6-c592583c241b` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-bc3a7c6f-1c60-47c6-acd5-d2e2cbb563e2` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-be9f157d-4095-4166-8d85-92229ed6063f` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-135a5a28-067c-4861-be85-11a5cbfee2de` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 24 | `qa-f6d3821f-95ba-4b37-8ece-bdd274607bfb` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-f93f3fad-2c5d-4bbe-89ad-4c9d5a00676d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-91c96d0f-8d9b-4620-b8a7-dc3fa767870f` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-6839356a-3527-43f9-b526-c9724bb2c952` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-eed2b62a-d6e2-4e7e-b4cf-84a539dc0724` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-c60044ee-049a-4579-a50b-3eea37dfc365` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-30c19720-b18f-437f-b7d6-c592583c241b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30c19720-b18f-437f-b7d6-c592583c241b
Content-Type: application/json

--- request body ---
{"handle":"qa-1f0b51e74d01","displayName":"QA 1f0b51e74d01","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-30c19720-b18f-437f-b7d6-c592583c241b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 7
Location: /v1/accounts/qa-1f0b51e74d01
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ce0ad3e9-f316-400e-a167-8f81e4ff73ae","handle":"qa-1f0b51e74d01","displayName":"QA 1f0b51e74d01","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.765511008Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bc3a7c6f-1c60-47c6-acd5-d2e2cbb563e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc3a7c6f-1c60-47c6-acd5-d2e2cbb563e2
Content-Type: application/json

--- request body ---
{"handle":"qa-dfe36eac544b","displayName":"QA dfe36eac544b","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc3a7c6f-1c60-47c6-acd5-d2e2cbb563e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 7
Location: /v1/accounts/qa-dfe36eac544b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_542da7c5-bae6-49da-b809-162733327548","handle":"qa-dfe36eac544b","displayName":"QA dfe36eac544b","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.820642499Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-be9f157d-4095-4166-8d85-92229ed6063f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be9f157d-4095-4166-8d85-92229ed6063f
Content-Type: application/json

--- request body ---
{"handle":"qa-1f0b51e74d01","password":"****"}

--- response: 200 in 28 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-be9f157d-4095-4166-8d85-92229ed6063f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ce0ad3e9-f316-400e-a167-8f81e4ff73ae"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-135a5a28-067c-4861-be85-11a5cbfee2de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-135a5a28-067c-4861-be85-11a5cbfee2de
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-dfe36eac544b","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-135a5a28-067c-4861-be85-11a5cbfee2de
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
Location: /v1/conversations/cnv_1f3fb957-bb89-4c2f-ba0b-57aa9235e919
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1f3fb957-bb89-4c2f-ba0b-57aa9235e919","subject":"Error contract","status":"open","region":"eu","participants":["qa-1f0b51e74d01","qa-dfe36eac544b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:35.906612892Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_1f3fb957-bb89-4c2f-ba0b-57aa9235e919/messages
correlation: qa-f6d3821f-95ba-4b37-8ece-bdd274607bfb

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 842dbb6a-41f3-4f2c-b37c-fa340e0a6874
X-Correlation-Id: qa-f6d3821f-95ba-4b37-8ece-bdd274607bfb
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 24 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f6d3821f-95ba-4b37-8ece-bdd274607bfb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_1f3fb957-bb89-4c2f-ba0b-57aa9235e919/messages","correlationId":"qa-f6d3821f-95ba-4b37-8ece-bdd274607bfb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f93f3fad-2c5d-4bbe-89ad-4c9d5a00676d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f93f3fad-2c5d-4bbe-89ad-4c9d5a00676d
Content-Type: application/json

--- request body ---
{"handle":"qa-dfe36eac544b","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-f93f3fad-2c5d-4bbe-89ad-4c9d5a00676d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_542da7c5-bae6-49da-b809-162733327548"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-91c96d0f-8d9b-4620-b8a7-dc3fa767870f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91c96d0f-8d9b-4620-b8a7-dc3fa767870f
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-91c96d0f-8d9b-4620-b8a7-dc3fa767870f
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
correlation: qa-6839356a-3527-43f9-b526-c9724bb2c952

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6839356a-3527-43f9-b526-c9724bb2c952
Content-Type: application/json

--- request body ---
{"handle":"qa-dfe36eac544b","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6839356a-3527-43f9-b526-c9724bb2c952
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6839356a-3527-43f9-b526-c9724bb2c952"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eed2b62a-d6e2-4e7e-b4cf-84a539dc0724

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eed2b62a-d6e2-4e7e-b4cf-84a539dc0724
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eed2b62a-d6e2-4e7e-b4cf-84a539dc0724
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
correlation: qa-c60044ee-049a-4579-a50b-3eea37dfc365

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c60044ee-049a-4579-a50b-3eea37dfc365
Content-Type: application/json

--- request body ---
{"handle":"qa-1f0b51e74d01","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c60044ee-049a-4579-a50b-3eea37dfc365
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c60044ee-049a-4579-a50b-3eea37dfc365"}
```

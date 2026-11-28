# Transcript: Every operation answers an outage with a 503 problem and Retry-After [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[3]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 65 | `qa-cd20ce6c-10d8-4cd0-a36d-cd2aada4edd0` |
| 2 | `POST /v1/accounts` | 201 | 63 | `qa-fa26d0b1-c38a-4d77-84b9-569294a54e55` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-127fae98-6104-4ae2-af6c-d8e3afe21e27` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-3b4a7e5f-9a68-44ac-8254-90b6383fd692` |
| 5 | `PATCH /v1/accounts/me` | 503 | 20 | `qa-57842440-89bd-4929-89a3-c0db8a9c9b73` |
| 6 | `POST /v1/auth/token` | 200 | 48 | `qa-f6911058-0532-4b8b-ae2f-74bbaa943eda` |
| 7 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-e2cb192b-6049-4aa9-a53e-b9d28cde257a` |
| 8 | `POST /v1/auth/token` | 401 | 30 | `qa-4c235c11-598a-45a3-9c5e-d1cd7685ac81` |
| 9 | `DELETE /v1/accounts/me` | 204 | 62 | `qa-045cb839-6198-410d-9510-435465036b95` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-6c7b113e-7e7f-46c8-bdbc-4e0d5c775a81` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cd20ce6c-10d8-4cd0-a36d-cd2aada4edd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd20ce6c-10d8-4cd0-a36d-cd2aada4edd0
Content-Type: application/json

--- request body ---
{"handle":"qa-72ed03acb2ba","displayName":"QA 72ed03acb2ba","password":"****","region":"eu"}

--- response: 201 in 65 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd20ce6c-10d8-4cd0-a36d-cd2aada4edd0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Location: /v1/accounts/qa-72ed03acb2ba
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b0beb62e-b089-40b1-b4c4-e59c6cfb6ff6","handle":"qa-72ed03acb2ba","displayName":"QA 72ed03acb2ba","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.638295217Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fa26d0b1-c38a-4d77-84b9-569294a54e55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa26d0b1-c38a-4d77-84b9-569294a54e55
Content-Type: application/json

--- request body ---
{"handle":"qa-7d79666cc61a","displayName":"QA 7d79666cc61a","password":"****","region":"eu"}

--- response: 201 in 63 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa26d0b1-c38a-4d77-84b9-569294a54e55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 9
Location: /v1/accounts/qa-7d79666cc61a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_517d0985-a1fe-4c70-bc23-92941846d586","handle":"qa-7d79666cc61a","displayName":"QA 7d79666cc61a","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.726586440Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-127fae98-6104-4ae2-af6c-d8e3afe21e27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-127fae98-6104-4ae2-af6c-d8e3afe21e27
Content-Type: application/json

--- request body ---
{"handle":"qa-72ed03acb2ba","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-127fae98-6104-4ae2-af6c-d8e3afe21e27
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b0beb62e-b089-40b1-b4c4-e59c6cfb6ff6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3b4a7e5f-9a68-44ac-8254-90b6383fd692

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b4a7e5f-9a68-44ac-8254-90b6383fd692
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7d79666cc61a","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b4a7e5f-9a68-44ac-8254-90b6383fd692
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
Location: /v1/conversations/cnv_7da99243-4f7c-4907-8083-177c9c5221a0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7da99243-4f7c-4907-8083-177c9c5221a0","subject":"Error contract","status":"open","region":"eu","participants":["qa-72ed03acb2ba","qa-7d79666cc61a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:22.816287198Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-57842440-89bd-4929-89a3-c0db8a9c9b73

--- request headers ---
Accept: application/json
X-Fault-Key: 1ed0430b-22e5-4294-81eb-47b2570791bc
X-Fault: unavailable-once
X-Correlation-Id: qa-57842440-89bd-4929-89a3-c0db8a9c9b73
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 20 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-57842440-89bd-4929-89a3-c0db8a9c9b73
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-57842440-89bd-4929-89a3-c0db8a9c9b73"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f6911058-0532-4b8b-ae2f-74bbaa943eda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6911058-0532-4b8b-ae2f-74bbaa943eda
Content-Type: application/json

--- request body ---
{"handle":"qa-7d79666cc61a","password":"****"}

--- response: 200 in 48 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6911058-0532-4b8b-ae2f-74bbaa943eda
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_517d0985-a1fe-4c70-bc23-92941846d586"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e2cb192b-6049-4aa9-a53e-b9d28cde257a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2cb192b-6049-4aa9-a53e-b9d28cde257a
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e2cb192b-6049-4aa9-a53e-b9d28cde257a
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
correlation: qa-4c235c11-598a-45a3-9c5e-d1cd7685ac81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c235c11-598a-45a3-9c5e-d1cd7685ac81
Content-Type: application/json

--- request body ---
{"handle":"qa-7d79666cc61a","password":"****"}

--- response: 401 in 30 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4c235c11-598a-45a3-9c5e-d1cd7685ac81
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4c235c11-598a-45a3-9c5e-d1cd7685ac81"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-045cb839-6198-410d-9510-435465036b95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-045cb839-6198-410d-9510-435465036b95
Content-Type: application/json

--- response: 204 in 62 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-045cb839-6198-410d-9510-435465036b95
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
correlation: qa-6c7b113e-7e7f-46c8-bdbc-4e0d5c775a81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c7b113e-7e7f-46c8-bdbc-4e0d5c775a81
Content-Type: application/json

--- request body ---
{"handle":"qa-72ed03acb2ba","password":"****"}

--- response: 401 in 21 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6c7b113e-7e7f-46c8-bdbc-4e0d5c775a81
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 491
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6c7b113e-7e7f-46c8-bdbc-4e0d5c775a81"}
```

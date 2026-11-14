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
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-0dbbe783-e7a8-4b75-af8b-ba9cca07ac4d` |
| 2 | `POST /v1/accounts` | 201 | 48 | `qa-eba42ef8-672a-41e3-a24b-a3875ddf4350` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-7246feb2-70f6-42ae-858f-287a4852d060` |
| 4 | `POST /v1/conversations` | 201 | 35 | `qa-b9102246-efb5-4e8f-bd50-bb32c1b62f16` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 26 | `qa-e6957940-fd4c-44ca-9a78-03ca95e17b5d` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-2594de30-6d95-4eea-bad6-7164f5f8b1a2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-4a12e5bb-f258-4ee6-9481-1669d99cf20c` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-39830b8c-5d5e-49c3-a859-972d8d72d298` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-c317d595-cf82-407d-bcec-9fe0c6030791` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-bd2c8695-5284-41a5-a80f-120ac92f909d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0dbbe783-e7a8-4b75-af8b-ba9cca07ac4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dbbe783-e7a8-4b75-af8b-ba9cca07ac4d
Content-Type: application/json

--- request body ---
{"handle":"qa-6cfcd7e8256b","displayName":"QA 6cfcd7e8256b","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-0dbbe783-e7a8-4b75-af8b-ba9cca07ac4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 7
Location: /v1/accounts/qa-6cfcd7e8256b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2c9127e4-22d1-4cba-836f-e196317f7ffa","handle":"qa-6cfcd7e8256b","displayName":"QA 6cfcd7e8256b","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.104874134Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-eba42ef8-672a-41e3-a24b-a3875ddf4350

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eba42ef8-672a-41e3-a24b-a3875ddf4350
Content-Type: application/json

--- request body ---
{"handle":"qa-649347bd7533","displayName":"QA 649347bd7533","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-eba42ef8-672a-41e3-a24b-a3875ddf4350
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 7
Location: /v1/accounts/qa-649347bd7533
X-Served-Region: eu
Content-Length: 181

{"id":"acc_acfd5426-e56a-4c15-bb62-50025ce991a0","handle":"qa-649347bd7533","displayName":"QA 649347bd7533","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.159675161Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7246feb2-70f6-42ae-858f-287a4852d060

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7246feb2-70f6-42ae-858f-287a4852d060
Content-Type: application/json

--- request body ---
{"handle":"qa-6cfcd7e8256b","password":"****"}

--- response: 200 in 34 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-7246feb2-70f6-42ae-858f-287a4852d060
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2c9127e4-22d1-4cba-836f-e196317f7ffa"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b9102246-efb5-4e8f-bd50-bb32c1b62f16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9102246-efb5-4e8f-bd50-bb32c1b62f16
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-649347bd7533","subject":"Error contract","message":"Hi"}

--- response: 201 in 35 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9102246-efb5-4e8f-bd50-bb32c1b62f16
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
Location: /v1/conversations/cnv_deb9e650-bb64-4811-b1c2-0445d50d2da6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_deb9e650-bb64-4811-b1c2-0445d50d2da6","subject":"Error contract","status":"open","region":"eu","participants":["qa-6cfcd7e8256b","qa-649347bd7533"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:56.287007580Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_deb9e650-bb64-4811-b1c2-0445d50d2da6/messages
correlation: qa-e6957940-fd4c-44ca-9a78-03ca95e17b5d

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 6e159acd-6f0b-4805-b98b-4d1e169386f2
X-Correlation-Id: qa-e6957940-fd4c-44ca-9a78-03ca95e17b5d
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 26 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e6957940-fd4c-44ca-9a78-03ca95e17b5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_deb9e650-bb64-4811-b1c2-0445d50d2da6/messages","correlationId":"qa-e6957940-fd4c-44ca-9a78-03ca95e17b5d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2594de30-6d95-4eea-bad6-7164f5f8b1a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2594de30-6d95-4eea-bad6-7164f5f8b1a2
Content-Type: application/json

--- request body ---
{"handle":"qa-649347bd7533","password":"****"}

--- response: 200 in 33 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-2594de30-6d95-4eea-bad6-7164f5f8b1a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_acfd5426-e56a-4c15-bb62-50025ce991a0"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4a12e5bb-f258-4ee6-9481-1669d99cf20c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a12e5bb-f258-4ee6-9481-1669d99cf20c
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4a12e5bb-f258-4ee6-9481-1669d99cf20c
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
correlation: qa-39830b8c-5d5e-49c3-a859-972d8d72d298

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39830b8c-5d5e-49c3-a859-972d8d72d298
Content-Type: application/json

--- request body ---
{"handle":"qa-649347bd7533","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-39830b8c-5d5e-49c3-a859-972d8d72d298
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-39830b8c-5d5e-49c3-a859-972d8d72d298"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c317d595-cf82-407d-bcec-9fe0c6030791

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c317d595-cf82-407d-bcec-9fe0c6030791
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c317d595-cf82-407d-bcec-9fe0c6030791
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
correlation: qa-bd2c8695-5284-41a5-a80f-120ac92f909d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd2c8695-5284-41a5-a80f-120ac92f909d
Content-Type: application/json

--- request body ---
{"handle":"qa-6cfcd7e8256b","password":"****"}

--- response: 401 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bd2c8695-5284-41a5-a80f-120ac92f909d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bd2c8695-5284-41a5-a80f-120ac92f909d"}
```

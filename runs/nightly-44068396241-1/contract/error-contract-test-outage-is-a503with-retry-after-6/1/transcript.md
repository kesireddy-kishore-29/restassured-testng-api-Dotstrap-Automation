# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[6]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-a9bd6a97-55e1-47f5-97c8-a47638d1d88e` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-bb91e781-a879-4ba0-8ec4-26d804765bf9` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-1119c402-3584-4ee3-91a8-25463b2b2df3` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-ba4b90c0-92c5-4712-9d83-80f05ac5611f` |
| 5 | `POST /v1/conversations` | 503 | 13 | `qa-7cc0d539-9949-4257-b4e5-e28f9e35da39` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-72625c3b-8f32-4eea-85b4-e5fc1cabb866` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-06400dfe-e959-43f1-9d9b-91dcf381bf1d` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-fab06aba-ef9f-4062-96f2-2bace2545d76` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-62b2d77f-1440-4b8b-92e0-1c48ec17f900` |
| 10 | `POST /v1/auth/token` | 401 | 32 | `qa-58b370ec-5abf-4b4a-a097-9df8ef7472ee` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a9bd6a97-55e1-47f5-97c8-a47638d1d88e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9bd6a97-55e1-47f5-97c8-a47638d1d88e
Content-Type: application/json

--- request body ---
{"handle":"qa-2f5b51cc17c9","displayName":"QA 2f5b51cc17c9","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9bd6a97-55e1-47f5-97c8-a47638d1d88e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 8
Location: /v1/accounts/qa-2f5b51cc17c9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1e810383-ea04-49bc-bca3-3be0d764eda1","handle":"qa-2f5b51cc17c9","displayName":"QA 2f5b51cc17c9","region":"eu","role":"user","createdAt":"2026-11-17T10:50:18.967374524Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bb91e781-a879-4ba0-8ec4-26d804765bf9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb91e781-a879-4ba0-8ec4-26d804765bf9
Content-Type: application/json

--- request body ---
{"handle":"qa-0ee0901093bf","displayName":"QA 0ee0901093bf","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb91e781-a879-4ba0-8ec4-26d804765bf9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 8
Location: /v1/accounts/qa-0ee0901093bf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d2e60c97-b3cc-4699-b400-e92e7da93ba4","handle":"qa-0ee0901093bf","displayName":"QA 0ee0901093bf","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.015138828Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1119c402-3584-4ee3-91a8-25463b2b2df3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1119c402-3584-4ee3-91a8-25463b2b2df3
Content-Type: application/json

--- request body ---
{"handle":"qa-2f5b51cc17c9","password":"****"}

--- response: 200 in 26 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-1119c402-3584-4ee3-91a8-25463b2b2df3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1e810383-ea04-49bc-bca3-3be0d764eda1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ba4b90c0-92c5-4712-9d83-80f05ac5611f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba4b90c0-92c5-4712-9d83-80f05ac5611f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0ee0901093bf","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba4b90c0-92c5-4712-9d83-80f05ac5611f
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
Location: /v1/conversations/cnv_412880c7-4600-439e-98fd-2b820431d53a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_412880c7-4600-439e-98fd-2b820431d53a","subject":"Error contract","status":"open","region":"eu","participants":["qa-2f5b51cc17c9","qa-0ee0901093bf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.079510328Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-7cc0d539-9949-4257-b4e5-e28f9e35da39

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 82f495b0-b69a-40ba-a3a8-26c887021811
X-Correlation-Id: qa-7cc0d539-9949-4257-b4e5-e28f9e35da39
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2f5b51cc17c9","subject":"Probe","message":"Hi"}

--- response: 503 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7cc0d539-9949-4257-b4e5-e28f9e35da39
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-7cc0d539-9949-4257-b4e5-e28f9e35da39"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-72625c3b-8f32-4eea-85b4-e5fc1cabb866

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72625c3b-8f32-4eea-85b4-e5fc1cabb866
Content-Type: application/json

--- request body ---
{"handle":"qa-0ee0901093bf","password":"****"}

--- response: 200 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-72625c3b-8f32-4eea-85b4-e5fc1cabb866
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d2e60c97-b3cc-4699-b400-e92e7da93ba4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-06400dfe-e959-43f1-9d9b-91dcf381bf1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06400dfe-e959-43f1-9d9b-91dcf381bf1d
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-06400dfe-e959-43f1-9d9b-91dcf381bf1d
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
correlation: qa-fab06aba-ef9f-4062-96f2-2bace2545d76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fab06aba-ef9f-4062-96f2-2bace2545d76
Content-Type: application/json

--- request body ---
{"handle":"qa-0ee0901093bf","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fab06aba-ef9f-4062-96f2-2bace2545d76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fab06aba-ef9f-4062-96f2-2bace2545d76"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-62b2d77f-1440-4b8b-92e0-1c48ec17f900

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62b2d77f-1440-4b8b-92e0-1c48ec17f900
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-62b2d77f-1440-4b8b-92e0-1c48ec17f900
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
correlation: qa-58b370ec-5abf-4b4a-a097-9df8ef7472ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58b370ec-5abf-4b4a-a097-9df8ef7472ee
Content-Type: application/json

--- request body ---
{"handle":"qa-2f5b51cc17c9","password":"****"}

--- response: 401 in 32 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-58b370ec-5abf-4b4a-a097-9df8ef7472ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-58b370ec-5abf-4b4a-a097-9df8ef7472ee"}
```

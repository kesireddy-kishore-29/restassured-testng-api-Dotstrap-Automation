# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[13]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 50 | `qa-7215d2c7-47a1-47dd-b32c-e70e3bc75036` |
| 2 | `POST /v1/accounts` | 201 | 52 | `qa-73ec28df-6b40-43e1-bc85-f8132a510bc9` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-35de6685-89e0-43b5-a75d-82c2366324d4` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-c25cd5a3-34ac-428e-8b68-69266e55ea00` |
| 5 | `GET /v1/credits/balance` | 503 | 10 | `qa-2d880057-ffc0-4b0d-be18-3abbbc0c9d2f` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-a3ad2e7e-573a-4beb-9d85-34ea341dba38` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-b976b6f0-fd30-45eb-b9ee-eb639edd11cb` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-915d449f-e091-4d26-9023-1a2cd6fb335f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-26038a4a-62ce-41a2-bf45-d02358caaf2f` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-c935e0ee-c373-494f-908c-82d7516db2b3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7215d2c7-47a1-47dd-b32c-e70e3bc75036

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7215d2c7-47a1-47dd-b32c-e70e3bc75036
Content-Type: application/json

--- request body ---
{"handle":"qa-c8676d15d1fd","displayName":"QA c8676d15d1fd","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-7215d2c7-47a1-47dd-b32c-e70e3bc75036
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 6
Location: /v1/accounts/qa-c8676d15d1fd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dd020633-6dbd-47fd-b69c-b3bb4a99cc62","handle":"qa-c8676d15d1fd","displayName":"QA c8676d15d1fd","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.751032614Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-73ec28df-6b40-43e1-bc85-f8132a510bc9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73ec28df-6b40-43e1-bc85-f8132a510bc9
Content-Type: application/json

--- request body ---
{"handle":"qa-42a0fe481cb5","displayName":"QA 42a0fe481cb5","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-73ec28df-6b40-43e1-bc85-f8132a510bc9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 6
Location: /v1/accounts/qa-42a0fe481cb5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3d9a971e-e5fb-42a9-82a0-18b3c195738d","handle":"qa-42a0fe481cb5","displayName":"QA 42a0fe481cb5","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.812883140Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-35de6685-89e0-43b5-a75d-82c2366324d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35de6685-89e0-43b5-a75d-82c2366324d4
Content-Type: application/json

--- request body ---
{"handle":"qa-c8676d15d1fd","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-35de6685-89e0-43b5-a75d-82c2366324d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dd020633-6dbd-47fd-b69c-b3bb4a99cc62"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c25cd5a3-34ac-428e-8b68-69266e55ea00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c25cd5a3-34ac-428e-8b68-69266e55ea00
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-42a0fe481cb5","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-c25cd5a3-34ac-428e-8b68-69266e55ea00
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
Location: /v1/conversations/cnv_f8735f00-a3f8-403f-8ad5-84814099bfdf
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f8735f00-a3f8-403f-8ad5-84814099bfdf","subject":"Error contract","status":"open","region":"eu","participants":["qa-c8676d15d1fd","qa-42a0fe481cb5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:46.926710771Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-2d880057-ffc0-4b0d-be18-3abbbc0c9d2f

--- request headers ---
Accept: application/json
X-Fault-Key: cd666f9f-927c-4aaf-af18-eeffbdfac1fb
X-Fault: unavailable-once
X-Correlation-Id: qa-2d880057-ffc0-4b0d-be18-3abbbc0c9d2f
Content-Type: application/json

--- response: 503 in 10 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2d880057-ffc0-4b0d-be18-3abbbc0c9d2f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-2d880057-ffc0-4b0d-be18-3abbbc0c9d2f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a3ad2e7e-573a-4beb-9d85-34ea341dba38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3ad2e7e-573a-4beb-9d85-34ea341dba38
Content-Type: application/json

--- request body ---
{"handle":"qa-42a0fe481cb5","password":"****"}

--- response: 200 in 35 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3ad2e7e-573a-4beb-9d85-34ea341dba38
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3d9a971e-e5fb-42a9-82a0-18b3c195738d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b976b6f0-fd30-45eb-b9ee-eb639edd11cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b976b6f0-fd30-45eb-b9ee-eb639edd11cb
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b976b6f0-fd30-45eb-b9ee-eb639edd11cb
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
correlation: qa-915d449f-e091-4d26-9023-1a2cd6fb335f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-915d449f-e091-4d26-9023-1a2cd6fb335f
Content-Type: application/json

--- request body ---
{"handle":"qa-42a0fe481cb5","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-915d449f-e091-4d26-9023-1a2cd6fb335f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-915d449f-e091-4d26-9023-1a2cd6fb335f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-26038a4a-62ce-41a2-bf45-d02358caaf2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26038a4a-62ce-41a2-bf45-d02358caaf2f
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-26038a4a-62ce-41a2-bf45-d02358caaf2f
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
correlation: qa-c935e0ee-c373-494f-908c-82d7516db2b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c935e0ee-c373-494f-908c-82d7516db2b3
Content-Type: application/json

--- request body ---
{"handle":"qa-c8676d15d1fd","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c935e0ee-c373-494f-908c-82d7516db2b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c935e0ee-c373-494f-908c-82d7516db2b3"}
```

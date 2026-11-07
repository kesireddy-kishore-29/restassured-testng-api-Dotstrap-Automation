# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-f94347e6-3170-4d54-ba28-3641a1c29366` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-1ae9eb82-26a5-45a7-a5af-32048149b8cc` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-f783c805-7aae-4169-aa66-0e96c293b418` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-d3a63009-068b-49c7-8e48-888615018c33` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 28 | `qa-ae325f9d-8c97-4c94-ac4c-68924f2bf0f0` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-c3ae6587-47f9-451b-befd-2503a552cba2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-1132be49-2329-418a-afd7-bd02f5aed90a` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-1ffb6dbd-8859-46ba-85b8-028cadda8df0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-8cc1cf17-3a8c-4d50-9504-9e8002c2f62d` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-08d44f27-fde7-475d-9581-f4ec4def342a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f94347e6-3170-4d54-ba28-3641a1c29366

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f94347e6-3170-4d54-ba28-3641a1c29366
Content-Type: application/json

--- request body ---
{"handle":"qa-868036681a07","displayName":"QA 868036681a07","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-f94347e6-3170-4d54-ba28-3641a1c29366
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
Location: /v1/accounts/qa-868036681a07
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7dcbd611-36dc-45d6-9281-a49ae24efe91","handle":"qa-868036681a07","displayName":"QA 868036681a07","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.831591604Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1ae9eb82-26a5-45a7-a5af-32048149b8cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ae9eb82-26a5-45a7-a5af-32048149b8cc
Content-Type: application/json

--- request body ---
{"handle":"qa-94810d362196","displayName":"QA 94810d362196","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ae9eb82-26a5-45a7-a5af-32048149b8cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 8
Location: /v1/accounts/qa-94810d362196
X-Served-Region: eu
Content-Length: 181

{"id":"acc_516d126e-0b46-45c9-88b6-4be119f0b499","handle":"qa-94810d362196","displayName":"QA 94810d362196","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.872211186Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f783c805-7aae-4169-aa66-0e96c293b418

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f783c805-7aae-4169-aa66-0e96c293b418
Content-Type: application/json

--- request body ---
{"handle":"qa-868036681a07","password":"****"}

--- response: 200 in 26 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-f783c805-7aae-4169-aa66-0e96c293b418
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7dcbd611-36dc-45d6-9281-a49ae24efe91"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d3a63009-068b-49c7-8e48-888615018c33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3a63009-068b-49c7-8e48-888615018c33
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-94810d362196","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3a63009-068b-49c7-8e48-888615018c33
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
Location: /v1/conversations/cnv_9f24710f-6199-4780-b708-aae6fc5cd52e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9f24710f-6199-4780-b708-aae6fc5cd52e","subject":"Error contract","status":"open","region":"eu","participants":["qa-868036681a07","qa-94810d362196"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:32.926317466Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_9f24710f-6199-4780-b708-aae6fc5cd52e/read
correlation: qa-ae325f9d-8c97-4c94-ac4c-68924f2bf0f0

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 25ae08f7-4d91-443d-8460-94a7fe3d3e0a
X-Correlation-Id: qa-ae325f9d-8c97-4c94-ac4c-68924f2bf0f0
Content-Type: application/json

--- response: 503 in 28 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae325f9d-8c97-4c94-ac4c-68924f2bf0f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_9f24710f-6199-4780-b708-aae6fc5cd52e/read","correlationId":"qa-ae325f9d-8c97-4c94-ac4c-68924f2bf0f0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c3ae6587-47f9-451b-befd-2503a552cba2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3ae6587-47f9-451b-befd-2503a552cba2
Content-Type: application/json

--- request body ---
{"handle":"qa-94810d362196","password":"****"}

--- response: 200 in 19 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3ae6587-47f9-451b-befd-2503a552cba2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_516d126e-0b46-45c9-88b6-4be119f0b499"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1132be49-2329-418a-afd7-bd02f5aed90a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1132be49-2329-418a-afd7-bd02f5aed90a
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1132be49-2329-418a-afd7-bd02f5aed90a
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
correlation: qa-1ffb6dbd-8859-46ba-85b8-028cadda8df0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ffb6dbd-8859-46ba-85b8-028cadda8df0
Content-Type: application/json

--- request body ---
{"handle":"qa-94810d362196","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1ffb6dbd-8859-46ba-85b8-028cadda8df0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1ffb6dbd-8859-46ba-85b8-028cadda8df0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8cc1cf17-3a8c-4d50-9504-9e8002c2f62d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cc1cf17-3a8c-4d50-9504-9e8002c2f62d
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8cc1cf17-3a8c-4d50-9504-9e8002c2f62d
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
correlation: qa-08d44f27-fde7-475d-9581-f4ec4def342a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08d44f27-fde7-475d-9581-f4ec4def342a
Content-Type: application/json

--- request body ---
{"handle":"qa-868036681a07","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08d44f27-fde7-475d-9581-f4ec4def342a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-08d44f27-fde7-475d-9581-f4ec4def342a"}
```

# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[2]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-327965be-e272-4048-a508-c6c5e6034f61` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-12be7d59-2dd5-47d0-9c07-0ec6a658fecd` |
| 3 | `POST /v1/accounts` | 201 | 13 | `qa-9d665f48-c402-43a0-87ec-7efdd335f177` |
| 4 | `POST /v1/auth/token` | 200 | 20 | `qa-2e6325ea-f5d3-4305-a72c-ac272efbb2ce` |
| 5 | `POST /v1/conversations` | 201 | 34 | `qa-74a54231-cc2d-4d6c-86a7-eb421f1bac1a` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-51279b4c-44d9-4270-a063-80219b9ca674` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 17 | `qa-af418510-4ab7-4ba9-9a31-07c493ae038b` |
| 8 | `DELETE /v1/accounts/me` | 204 | 71 | `qa-ba849e4d-b3af-451b-a96e-fbf7e3980060` |
| 9 | `POST /v1/auth/token` | 401 | 33 | `qa-a403739a-21dc-4c52-afa8-12748bb09ab9` |
| 10 | `POST /v1/auth/token` | 200 | 56 | `qa-3c4b20c2-835f-46e8-9efb-0631c00087c9` |
| 11 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-3b419c58-a255-4450-921f-30c7afa1e168` |
| 12 | `POST /v1/auth/token` | 401 | 30 | `qa-3a3b3234-00a6-4430-8935-834348d18e3f` |
| 13 | `DELETE /v1/accounts/me` | 204 | 47 | `qa-d3053323-dcc6-40ea-b996-faee730aefa0` |
| 14 | `POST /v1/auth/token` | 401 | 23 | `qa-65d3ba3c-471c-4c15-b27d-f1fc98cfb768` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-327965be-e272-4048-a508-c6c5e6034f61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-327965be-e272-4048-a508-c6c5e6034f61
Content-Type: application/json

--- request body ---
{"handle":"qa-528cf89b8904","displayName":"QA 528cf89b8904","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-327965be-e272-4048-a508-c6c5e6034f61
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 9
Location: /v1/accounts/qa-528cf89b8904
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc4f3cbe-ea54-4ece-98f7-f9d5321047e7","handle":"qa-528cf89b8904","displayName":"QA 528cf89b8904","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.622350174Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-12be7d59-2dd5-47d0-9c07-0ec6a658fecd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12be7d59-2dd5-47d0-9c07-0ec6a658fecd
Content-Type: application/json

--- request body ---
{"handle":"qa-42af32770e7c","displayName":"QA 42af32770e7c","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-12be7d59-2dd5-47d0-9c07-0ec6a658fecd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 9
Location: /v1/accounts/qa-42af32770e7c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_56127108-14de-4f20-9cba-7aa500bfe2e9","handle":"qa-42af32770e7c","displayName":"QA 42af32770e7c","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.700927573Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-9d665f48-c402-43a0-87ec-7efdd335f177

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d665f48-c402-43a0-87ec-7efdd335f177
Content-Type: application/json

--- request body ---
{"handle":"qa-c0668c1f5503","displayName":"QA c0668c1f5503","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d665f48-c402-43a0-87ec-7efdd335f177
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 9
Location: /v1/accounts/qa-c0668c1f5503
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c8a2459c-7e1b-4f82-98dc-7f50adc11042","handle":"qa-c0668c1f5503","displayName":"QA c0668c1f5503","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.725445872Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-2e6325ea-f5d3-4305-a72c-ac272efbb2ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e6325ea-f5d3-4305-a72c-ac272efbb2ce
Content-Type: application/json

--- request body ---
{"handle":"qa-528cf89b8904","password":"****"}

--- response: 200 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e6325ea-f5d3-4305-a72c-ac272efbb2ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 531
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fc4f3cbe-ea54-4ece-98f7-f9d5321047e7"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-74a54231-cc2d-4d6c-86a7-eb421f1bac1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74a54231-cc2d-4d6c-86a7-eb421f1bac1a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-42af32770e7c","subject":"Error contract","message":"Hi"}

--- response: 201 in 34 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-74a54231-cc2d-4d6c-86a7-eb421f1bac1a
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
Location: /v1/conversations/cnv_3a38c384-8ba7-45e7-af87-ad35e8adf1ea
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3a38c384-8ba7-45e7-af87-ad35e8adf1ea","subject":"Error contract","status":"open","region":"eu","participants":["qa-528cf89b8904","qa-42af32770e7c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:32.821941212Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-51279b4c-44d9-4270-a063-80219b9ca674

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51279b4c-44d9-4270-a063-80219b9ca674
Content-Type: application/json

--- request body ---
{"handle":"qa-c0668c1f5503","password":"****"}

--- response: 200 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-51279b4c-44d9-4270-a063-80219b9ca674
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c8a2459c-7e1b-4f82-98dc-7f50adc11042"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_3a38c384-8ba7-45e7-af87-ad35e8adf1ea/messages
correlation: qa-af418510-4ab7-4ba9-9a31-07c493ae038b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af418510-4ab7-4ba9-9a31-07c493ae038b
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-af418510-4ab7-4ba9-9a31-07c493ae038b
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_3a38c384-8ba7-45e7-af87-ad35e8adf1ea/messages","correlationId":"qa-af418510-4ab7-4ba9-9a31-07c493ae038b"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ba849e4d-b3af-451b-a96e-fbf7e3980060

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba849e4d-b3af-451b-a96e-fbf7e3980060
Content-Type: application/json

--- response: 204 in 71 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ba849e4d-b3af-451b-a96e-fbf7e3980060
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-a403739a-21dc-4c52-afa8-12748bb09ab9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a403739a-21dc-4c52-afa8-12748bb09ab9
Content-Type: application/json

--- request body ---
{"handle":"qa-c0668c1f5503","password":"****"}

--- response: 401 in 33 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a403739a-21dc-4c52-afa8-12748bb09ab9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 515
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a403739a-21dc-4c52-afa8-12748bb09ab9"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-3c4b20c2-835f-46e8-9efb-0631c00087c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c4b20c2-835f-46e8-9efb-0631c00087c9
Content-Type: application/json

--- request body ---
{"handle":"qa-42af32770e7c","password":"****"}

--- response: 200 in 56 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c4b20c2-835f-46e8-9efb-0631c00087c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_56127108-14de-4f20-9cba-7aa500bfe2e9"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3b419c58-a255-4450-921f-30c7afa1e168

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b419c58-a255-4450-921f-30c7afa1e168
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3b419c58-a255-4450-921f-30c7afa1e168
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-3a3b3234-00a6-4430-8935-834348d18e3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a3b3234-00a6-4430-8935-834348d18e3f
Content-Type: application/json

--- request body ---
{"handle":"qa-42af32770e7c","password":"****"}

--- response: 401 in 30 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a3b3234-00a6-4430-8935-834348d18e3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3a3b3234-00a6-4430-8935-834348d18e3f"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d3053323-dcc6-40ea-b996-faee730aefa0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3053323-dcc6-40ea-b996-faee730aefa0
Content-Type: application/json

--- response: 204 in 47 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d3053323-dcc6-40ea-b996-faee730aefa0
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-65d3ba3c-471c-4c15-b27d-f1fc98cfb768

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65d3ba3c-471c-4c15-b27d-f1fc98cfb768
Content-Type: application/json

--- request body ---
{"handle":"qa-528cf89b8904","password":"****"}

--- response: 401 in 23 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-65d3ba3c-471c-4c15-b27d-f1fc98cfb768
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-65d3ba3c-471c-4c15-b27d-f1fc98cfb768"}
```

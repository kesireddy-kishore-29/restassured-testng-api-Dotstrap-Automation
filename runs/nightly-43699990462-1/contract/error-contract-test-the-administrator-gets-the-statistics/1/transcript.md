# Transcript: The administrator gets the service statistics

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#theAdministratorGetsTheStatistics` |
| Features | FEAT-AUTHZ-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-6d09fa09-99b2-44ca-8fa4-5136fd4b87bb` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-01354b7e-4ea9-4c6f-8e71-2a4c79f97894` |
| 3 | `POST /v1/auth/token` | 200 | 13 | `qa-ada3cd61-9f12-4a72-934c-da67d052e6f1` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-2c13d1bf-8596-401f-a7cb-3b29aff36d4c` |
| 5 | `POST /v1/auth/token` | 200 | 8 | `qa-57eddf10-bde7-437d-b451-afa520f424e2` |
| 6 | `GET /v1/admin/stats` | 200 | 10 | `qa-57658b76-a056-464e-955d-fc374d95159a` |
| 7 | `POST /v1/auth/token` | 200 | 12 | `qa-130ffe87-da7b-40dd-8640-3153623895c3` |
| 8 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-37e81548-ce05-4c39-8f7e-dc14f43ce96f` |
| 9 | `POST /v1/auth/token` | 401 | 4 | `qa-19f2034d-54c4-4adf-829b-d40777a0a4a1` |
| 10 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-cca6925e-7aa0-477b-ac2b-908e1c8f228b` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-92825003-07c3-4d4c-b319-e54ee8faee83` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6d09fa09-99b2-44ca-8fa4-5136fd4b87bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d09fa09-99b2-44ca-8fa4-5136fd4b87bb
Content-Type: application/json

--- request body ---
{"handle":"qa-d09442eec398","displayName":"QA d09442eec398","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d09fa09-99b2-44ca-8fa4-5136fd4b87bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 7
Location: /v1/accounts/qa-d09442eec398
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b5e2fae8-e574-44f1-9d1b-544ae68c2199","handle":"qa-d09442eec398","displayName":"QA d09442eec398","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.835985894Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-01354b7e-4ea9-4c6f-8e71-2a4c79f97894

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01354b7e-4ea9-4c6f-8e71-2a4c79f97894
Content-Type: application/json

--- request body ---
{"handle":"qa-37afdb2c18e2","displayName":"QA 37afdb2c18e2","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-01354b7e-4ea9-4c6f-8e71-2a4c79f97894
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 7
Location: /v1/accounts/qa-37afdb2c18e2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5548f682-1e0a-4e5d-8b4f-23151022a26d","handle":"qa-37afdb2c18e2","displayName":"QA 37afdb2c18e2","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.864794429Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ada3cd61-9f12-4a72-934c-da67d052e6f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ada3cd61-9f12-4a72-934c-da67d052e6f1
Content-Type: application/json

--- request body ---
{"handle":"qa-d09442eec398","password":"****"}

--- response: 200 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-ada3cd61-9f12-4a72-934c-da67d052e6f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b5e2fae8-e574-44f1-9d1b-544ae68c2199"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2c13d1bf-8596-401f-a7cb-3b29aff36d4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c13d1bf-8596-401f-a7cb-3b29aff36d4c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-37afdb2c18e2","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c13d1bf-8596-401f-a7cb-3b29aff36d4c
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
Location: /v1/conversations/cnv_1a498c41-1b8a-4f3f-879d-fd741d3a9104
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1a498c41-1b8a-4f3f-879d-fd741d3a9104","subject":"Error contract","status":"open","region":"eu","participants":["qa-d09442eec398","qa-37afdb2c18e2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:10.909188948Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-57eddf10-bde7-437d-b451-afa520f424e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57eddf10-bde7-437d-b451-afa520f424e2
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-57eddf10-bde7-437d-b451-afa520f424e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_16e71081-6377-4a2a-8105-e2372e4902c4"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-57658b76-a056-464e-955d-fc374d95159a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57658b76-a056-464e-955d-fc374d95159a
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-57658b76-a056-464e-955d-fc374d95159a
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
Content-Length: 46

{"accounts":9,"conversations":2,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-130ffe87-da7b-40dd-8640-3153623895c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-130ffe87-da7b-40dd-8640-3153623895c3
Content-Type: application/json

--- request body ---
{"handle":"qa-37afdb2c18e2","password":"****"}

--- response: 200 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-130ffe87-da7b-40dd-8640-3153623895c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5548f682-1e0a-4e5d-8b4f-23151022a26d"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-37e81548-ce05-4c39-8f7e-dc14f43ce96f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37e81548-ce05-4c39-8f7e-dc14f43ce96f
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-37e81548-ce05-4c39-8f7e-dc14f43ce96f
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-19f2034d-54c4-4adf-829b-d40777a0a4a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19f2034d-54c4-4adf-829b-d40777a0a4a1
Content-Type: application/json

--- request body ---
{"handle":"qa-37afdb2c18e2","password":"****"}

--- response: 401 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-19f2034d-54c4-4adf-829b-d40777a0a4a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-19f2034d-54c4-4adf-829b-d40777a0a4a1"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cca6925e-7aa0-477b-ac2b-908e1c8f228b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cca6925e-7aa0-477b-ac2b-908e1c8f228b
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cca6925e-7aa0-477b-ac2b-908e1c8f228b
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-92825003-07c3-4d4c-b319-e54ee8faee83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92825003-07c3-4d4c-b319-e54ee8faee83
Content-Type: application/json

--- request body ---
{"handle":"qa-d09442eec398","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-92825003-07c3-4d4c-b319-e54ee8faee83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-92825003-07c3-4d4c-b319-e54ee8faee83"}
```

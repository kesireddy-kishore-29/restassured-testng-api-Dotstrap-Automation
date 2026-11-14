# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[17]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-4dfbee39-e506-40b0-8d1c-7c9ae424ae75` |
| 2 | `POST /v1/accounts` | 201 | 13 | `qa-823e87fd-8193-4d4a-96cb-4fd608382677` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-7028ec17-00f6-4c98-b183-7748afaaa8af` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-2ed7f51f-2bb8-492f-b976-9f764beb63d4` |
| 5 | `POST /v1/credits/purchases` | 422 | 10 | `qa-c8a91c68-b651-46ef-8937-9da494e94e15` |
| 6 | `POST /v1/auth/token` | 200 | 8 | `qa-feffb82c-987a-4aec-a1a5-6ccbf16b9b94` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-ac9b73a9-920f-481f-ad30-a7c7ebe73bba` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-205c758e-8509-4c77-a78c-333bdf8c2c59` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-01b555a5-466f-49e1-ad69-1ca816235a97` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-29792521-ac60-4bb9-9466-cd83c074da33` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4dfbee39-e506-40b0-8d1c-7c9ae424ae75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dfbee39-e506-40b0-8d1c-7c9ae424ae75
Content-Type: application/json

--- request body ---
{"handle":"qa-39caac078302","displayName":"QA 39caac078302","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-4dfbee39-e506-40b0-8d1c-7c9ae424ae75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 7
Location: /v1/accounts/qa-39caac078302
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0253b1d-12b6-4e0d-a86c-6e314eb4ac41","handle":"qa-39caac078302","displayName":"QA 39caac078302","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.564047611Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-823e87fd-8193-4d4a-96cb-4fd608382677

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-823e87fd-8193-4d4a-96cb-4fd608382677
Content-Type: application/json

--- request body ---
{"handle":"qa-e0fc6f104013","displayName":"QA e0fc6f104013","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-823e87fd-8193-4d4a-96cb-4fd608382677
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 7
Location: /v1/accounts/qa-e0fc6f104013
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2b6cc362-ffb5-4f34-853d-8c42eea2a4e7","handle":"qa-e0fc6f104013","displayName":"QA e0fc6f104013","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.583019562Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7028ec17-00f6-4c98-b183-7748afaaa8af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7028ec17-00f6-4c98-b183-7748afaaa8af
Content-Type: application/json

--- request body ---
{"handle":"qa-39caac078302","password":"****"}

--- response: 200 in 20 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-7028ec17-00f6-4c98-b183-7748afaaa8af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d0253b1d-12b6-4e0d-a86c-6e314eb4ac41"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2ed7f51f-2bb8-492f-b976-9f764beb63d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ed7f51f-2bb8-492f-b976-9f764beb63d4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e0fc6f104013","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ed7f51f-2bb8-492f-b976-9f764beb63d4
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
Location: /v1/conversations/cnv_ea4e9111-f9b6-49a0-8b38-42544ed9e64d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ea4e9111-f9b6-49a0-8b38-42544ed9e64d","subject":"Error contract","status":"open","region":"eu","participants":["qa-39caac078302","qa-e0fc6f104013"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:08.686917312Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c8a91c68-b651-46ef-8937-9da494e94e15

--- request headers ---
Accept: application/json
Idempotency-Key: qa-457947518a804679a83a320ee12134bd
X-Correlation-Id: qa-c8a91c68-b651-46ef-8937-9da494e94e15
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c8a91c68-b651-46ef-8937-9da494e94e15
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-c8a91c68-b651-46ef-8937-9da494e94e15","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-feffb82c-987a-4aec-a1a5-6ccbf16b9b94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-feffb82c-987a-4aec-a1a5-6ccbf16b9b94
Content-Type: application/json

--- request body ---
{"handle":"qa-e0fc6f104013","password":"****"}

--- response: 200 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-feffb82c-987a-4aec-a1a5-6ccbf16b9b94
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2b6cc362-ffb5-4f34-853d-8c42eea2a4e7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ac9b73a9-920f-481f-ad30-a7c7ebe73bba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac9b73a9-920f-481f-ad30-a7c7ebe73bba
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ac9b73a9-920f-481f-ad30-a7c7ebe73bba
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
correlation: qa-205c758e-8509-4c77-a78c-333bdf8c2c59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-205c758e-8509-4c77-a78c-333bdf8c2c59
Content-Type: application/json

--- request body ---
{"handle":"qa-e0fc6f104013","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-205c758e-8509-4c77-a78c-333bdf8c2c59
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-205c758e-8509-4c77-a78c-333bdf8c2c59"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-01b555a5-466f-49e1-ad69-1ca816235a97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01b555a5-466f-49e1-ad69-1ca816235a97
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-01b555a5-466f-49e1-ad69-1ca816235a97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-29792521-ac60-4bb9-9466-cd83c074da33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29792521-ac60-4bb9-9466-cd83c074da33
Content-Type: application/json

--- request body ---
{"handle":"qa-39caac078302","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-29792521-ac60-4bb9-9466-cd83c074da33
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-29792521-ac60-4bb9-9466-cd83c074da33"}
```

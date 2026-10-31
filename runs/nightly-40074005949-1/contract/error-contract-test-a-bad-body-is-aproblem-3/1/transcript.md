# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 44 | `qa-cf1617db-f968-4887-8c1f-cbf075d53f01` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-47f67752-1d10-4358-af1c-86eeeb22976d` |
| 3 | `POST /v1/auth/token` | 200 | 12 | `qa-13d89cdc-25c1-4cb8-8d42-d1694fbd66a3` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-103fb917-8698-40fa-9b6f-e3dc0852c1bc` |
| 5 | `POST /v1/accounts` | 400 | 7 | `qa-73af9008-4ff5-4b9c-9bcc-72a80bdc15ba` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-c0d76207-b4b7-4f52-b34e-f22813231dc3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 39 | `qa-b6f6aed4-89a1-4ba6-8351-8a1f157fab41` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-5897755e-2149-4458-9979-730bae9a7e9a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-61982613-7710-4299-8a95-440cf744d36f` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-ebef3d75-3ec7-488c-acd1-8f04ba5fdf02` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cf1617db-f968-4887-8c1f-cbf075d53f01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf1617db-f968-4887-8c1f-cbf075d53f01
Content-Type: application/json

--- request body ---
{"handle":"qa-adbe272b53d8","displayName":"QA adbe272b53d8","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf1617db-f968-4887-8c1f-cbf075d53f01
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
Location: /v1/accounts/qa-adbe272b53d8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49ef4037-3c0a-411c-979c-d1a87633ce0f","handle":"qa-adbe272b53d8","displayName":"QA adbe272b53d8","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.830531676Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-47f67752-1d10-4358-af1c-86eeeb22976d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47f67752-1d10-4358-af1c-86eeeb22976d
Content-Type: application/json

--- request body ---
{"handle":"qa-8a57757a255f","displayName":"QA 8a57757a255f","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-47f67752-1d10-4358-af1c-86eeeb22976d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 10
Location: /v1/accounts/qa-8a57757a255f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f385a82e-a00a-4d7a-be4d-2d5b70cae53a","handle":"qa-8a57757a255f","displayName":"QA 8a57757a255f","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.889130727Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-13d89cdc-25c1-4cb8-8d42-d1694fbd66a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13d89cdc-25c1-4cb8-8d42-d1694fbd66a3
Content-Type: application/json

--- request body ---
{"handle":"qa-adbe272b53d8","password":"****"}

--- response: 200 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-13d89cdc-25c1-4cb8-8d42-d1694fbd66a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_49ef4037-3c0a-411c-979c-d1a87633ce0f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-103fb917-8698-40fa-9b6f-e3dc0852c1bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-103fb917-8698-40fa-9b6f-e3dc0852c1bc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8a57757a255f","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-103fb917-8698-40fa-9b6f-e3dc0852c1bc
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
Location: /v1/conversations/cnv_910c242f-9744-4f6a-8626-e18e6e49467a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_910c242f-9744-4f6a-8626-e18e6e49467a","subject":"Error contract","status":"open","region":"eu","participants":["qa-adbe272b53d8","qa-8a57757a255f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:01.993033412Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-73af9008-4ff5-4b9c-9bcc-72a80bdc15ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73af9008-4ff5-4b9c-9bcc-72a80bdc15ba
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-73af9008-4ff5-4b9c-9bcc-72a80bdc15ba
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
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-73af9008-4ff5-4b9c-9bcc-72a80bdc15ba"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c0d76207-b4b7-4f52-b34e-f22813231dc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0d76207-b4b7-4f52-b34e-f22813231dc3
Content-Type: application/json

--- request body ---
{"handle":"qa-8a57757a255f","password":"****"}

--- response: 200 in 41 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0d76207-b4b7-4f52-b34e-f22813231dc3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f385a82e-a00a-4d7a-be4d-2d5b70cae53a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b6f6aed4-89a1-4ba6-8351-8a1f157fab41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6f6aed4-89a1-4ba6-8351-8a1f157fab41
Content-Type: application/json

--- response: 204 in 39 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b6f6aed4-89a1-4ba6-8351-8a1f157fab41
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
correlation: qa-5897755e-2149-4458-9979-730bae9a7e9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5897755e-2149-4458-9979-730bae9a7e9a
Content-Type: application/json

--- request body ---
{"handle":"qa-8a57757a255f","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5897755e-2149-4458-9979-730bae9a7e9a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5897755e-2149-4458-9979-730bae9a7e9a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-61982613-7710-4299-8a95-440cf744d36f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61982613-7710-4299-8a95-440cf744d36f
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-61982613-7710-4299-8a95-440cf744d36f
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
correlation: qa-ebef3d75-3ec7-488c-acd1-8f04ba5fdf02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebef3d75-3ec7-488c-acd1-8f04ba5fdf02
Content-Type: application/json

--- request body ---
{"handle":"qa-adbe272b53d8","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ebef3d75-3ec7-488c-acd1-8f04ba5fdf02
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ebef3d75-3ec7-488c-acd1-8f04ba5fdf02"}
```

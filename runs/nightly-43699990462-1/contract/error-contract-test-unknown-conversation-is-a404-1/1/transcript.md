# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-e439b7b8-e973-4974-bc00-8c2618e2790f` |
| 2 | `POST /v1/auth/token` | 200 | 22 | `qa-abdc79e5-f4b7-49ed-a610-46c39c530c06` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 25 | `qa-72c0ae77-7470-4b01-8311-1a811f26b81d` |
| 4 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-0b7644dc-a69f-46de-9175-0a655b3b3289` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-61181683-c12d-47ad-850d-b46f993ee9d4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e439b7b8-e973-4974-bc00-8c2618e2790f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e439b7b8-e973-4974-bc00-8c2618e2790f
Content-Type: application/json

--- request body ---
{"handle":"qa-5823cb23a8bf","displayName":"QA 5823cb23a8bf","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-e439b7b8-e973-4974-bc00-8c2618e2790f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 7
Location: /v1/accounts/qa-5823cb23a8bf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_08514b53-f0a3-429d-b295-d1cf2604bab8","handle":"qa-5823cb23a8bf","displayName":"QA 5823cb23a8bf","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.864864451Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-abdc79e5-f4b7-49ed-a610-46c39c530c06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abdc79e5-f4b7-49ed-a610-46c39c530c06
Content-Type: application/json

--- request body ---
{"handle":"qa-5823cb23a8bf","password":"****"}

--- response: 200 in 22 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-abdc79e5-f4b7-49ed-a610-46c39c530c06
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_08514b53-f0a3-429d-b295-d1cf2604bab8"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-72c0ae77-7470-4b01-8311-1a811f26b81d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72c0ae77-7470-4b01-8311-1a811f26b81d
Content-Type: application/json

--- response: 404 in 25 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-72c0ae77-7470-4b01-8311-1a811f26b81d
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
Content-Length: 262

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-72c0ae77-7470-4b01-8311-1a811f26b81d"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0b7644dc-a69f-46de-9175-0a655b3b3289

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b7644dc-a69f-46de-9175-0a655b3b3289
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0b7644dc-a69f-46de-9175-0a655b3b3289
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-61181683-c12d-47ad-850d-b46f993ee9d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61181683-c12d-47ad-850d-b46f993ee9d4
Content-Type: application/json

--- request body ---
{"handle":"qa-5823cb23a8bf","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61181683-c12d-47ad-850d-b46f993ee9d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-61181683-c12d-47ad-850d-b46f993ee9d4"}
```

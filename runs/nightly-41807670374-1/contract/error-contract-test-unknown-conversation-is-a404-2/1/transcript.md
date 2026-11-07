# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-03cd7d74-4a9a-4d9d-a930-6cc791372f18` |
| 2 | `POST /v1/auth/token` | 200 | 26 | `qa-62e1107a-12ec-4ae0-86f0-b6e7a7de6fae` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 8 | `qa-2ebd8bce-2af6-4b5c-a17b-79f092b71a8b` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-8464daa1-d926-4380-81fb-070da0cad336` |
| 5 | `POST /v1/auth/token` | 401 | 4 | `qa-f6374eae-7cab-4837-b212-ad0daccf2cfb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-03cd7d74-4a9a-4d9d-a930-6cc791372f18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03cd7d74-4a9a-4d9d-a930-6cc791372f18
Content-Type: application/json

--- request body ---
{"handle":"qa-d477ce4bf0c1","displayName":"QA d477ce4bf0c1","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-03cd7d74-4a9a-4d9d-a930-6cc791372f18
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 8
Location: /v1/accounts/qa-d477ce4bf0c1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b0b38969-09b0-4600-9374-46592b540475","handle":"qa-d477ce4bf0c1","displayName":"QA d477ce4bf0c1","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.744479345Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-62e1107a-12ec-4ae0-86f0-b6e7a7de6fae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62e1107a-12ec-4ae0-86f0-b6e7a7de6fae
Content-Type: application/json

--- request body ---
{"handle":"qa-d477ce4bf0c1","password":"****"}

--- response: 200 in 26 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-62e1107a-12ec-4ae0-86f0-b6e7a7de6fae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b0b38969-09b0-4600-9374-46592b540475"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-2ebd8bce-2af6-4b5c-a17b-79f092b71a8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ebd8bce-2af6-4b5c-a17b-79f092b71a8b
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ebd8bce-2af6-4b5c-a17b-79f092b71a8b
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-2ebd8bce-2af6-4b5c-a17b-79f092b71a8b"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8464daa1-d926-4380-81fb-070da0cad336

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8464daa1-d926-4380-81fb-070da0cad336
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8464daa1-d926-4380-81fb-070da0cad336
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
correlation: qa-f6374eae-7cab-4837-b212-ad0daccf2cfb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6374eae-7cab-4837-b212-ad0daccf2cfb
Content-Type: application/json

--- request body ---
{"handle":"qa-d477ce4bf0c1","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f6374eae-7cab-4837-b212-ad0daccf2cfb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f6374eae-7cab-4837-b212-ad0daccf2cfb"}
```

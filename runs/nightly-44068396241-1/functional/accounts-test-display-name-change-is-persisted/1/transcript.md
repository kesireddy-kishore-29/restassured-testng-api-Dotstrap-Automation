# Transcript: A new display name is stored and returned

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#displayNameChangeIsPersisted` |
| Features | FEAT-ACCT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 336 | `qa-85196fc5-84a1-4c0a-81d1-d56974d1da3a` |
| 2 | `POST /v1/auth/token` | 200 | 53 | `qa-17abdf7b-d836-473d-b7c0-d9daf1c5ff80` |
| 3 | `PATCH /v1/accounts/me` | 200 | 39 | `qa-1d5e00d6-feee-4c35-8f33-e54c1b8e92a6` |
| 4 | `GET /v1/accounts/me` | 200 | 17 | `qa-9155ff17-1222-48e7-82c0-85dbc7e2a211` |
| 5 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-09e67bad-fc6b-4c83-9268-e88c96b95ec8` |
| 6 | `POST /v1/auth/token` | 401 | 40 | `qa-9056f01f-596b-412d-a9bb-93619796c864` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-85196fc5-84a1-4c0a-81d1-d56974d1da3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85196fc5-84a1-4c0a-81d1-d56974d1da3a
Content-Type: application/json

--- request body ---
{"handle":"qa-29287c8c4f76","displayName":"QA 29287c8c4f76","password":"****","region":"eu"}

--- response: 201 in 336 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-85196fc5-84a1-4c0a-81d1-d56974d1da3a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 11
Location: /v1/accounts/qa-29287c8c4f76
X-Served-Region: eu
Content-Length: 181

{"id":"acc_974df39a-c7a9-4422-8cca-36b6fa959f68","handle":"qa-29287c8c4f76","displayName":"QA 29287c8c4f76","region":"eu","role":"user","createdAt":"2026-11-17T10:50:10.065122135Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-17abdf7b-d836-473d-b7c0-d9daf1c5ff80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17abdf7b-d836-473d-b7c0-d9daf1c5ff80
Content-Type: application/json

--- request body ---
{"handle":"qa-29287c8c4f76","password":"****"}

--- response: 200 in 53 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-17abdf7b-d836-473d-b7c0-d9daf1c5ff80
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_974df39a-c7a9-4422-8cca-36b6fa959f68"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-1d5e00d6-feee-4c35-8f33-e54c1b8e92a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d5e00d6-feee-4c35-8f33-e54c1b8e92a6
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 39 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d5e00d6-feee-4c35-8f33-e54c1b8e92a6
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
Content-Length: 179

{"id":"acc_974df39a-c7a9-4422-8cca-36b6fa959f68","handle":"qa-29287c8c4f76","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-17T10:50:10.065122135Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-9155ff17-1222-48e7-82c0-85dbc7e2a211

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9155ff17-1222-48e7-82c0-85dbc7e2a211
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-9155ff17-1222-48e7-82c0-85dbc7e2a211
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
Content-Length: 179

{"id":"acc_974df39a-c7a9-4422-8cca-36b6fa959f68","handle":"qa-29287c8c4f76","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-17T10:50:10.065122135Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-09e67bad-fc6b-4c83-9268-e88c96b95ec8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09e67bad-fc6b-4c83-9268-e88c96b95ec8
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-09e67bad-fc6b-4c83-9268-e88c96b95ec8
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

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9056f01f-596b-412d-a9bb-93619796c864

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9056f01f-596b-412d-a9bb-93619796c864
Content-Type: application/json

--- request body ---
{"handle":"qa-29287c8c4f76","password":"****"}

--- response: 401 in 40 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9056f01f-596b-412d-a9bb-93619796c864
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9056f01f-596b-412d-a9bb-93619796c864"}
```

# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 83 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 423 | `qa-0d61bfcc-e2a8-4282-a93c-74aa1fdcb037` |
| 2 | `POST /v1/auth/token` | 200 | 55 | `qa-bb4adfd7-e998-454f-9a43-9fdc509596fa` |
| 3 | `GET /v1/accounts/me` | 200 | 47 | `qa-b8ad68c4-b565-4c09-8567-66952c5e336f` |
| 4 | `GET /v1/accounts/me` | 200 | 20 | `qa-0690cdf8-b684-4489-bd88-a90d7d929239` |
| 5 | `GET /v1/accounts/me` | 200 | 24 | `qa-3fd10ace-7226-4165-9f50-2f1bc43bffd1` |
| 6 | `GET /v1/accounts/me` | 200 | 19 | `qa-26d345eb-b858-405b-a128-ebbb133ecef6` |
| 7 | `GET /v1/accounts/me` | 200 | 23 | `qa-b666fcb1-543d-464b-ad6f-d18ae185c3c5` |
| 8 | `GET /v1/accounts/me` | 200 | 10 | `qa-272579f8-096d-46c3-a495-b11a3832f268` |
| 9 | `GET /v1/accounts/me` | 200 | 14 | `qa-d1318514-7a70-453a-b6c4-bee435796cbd` |
| 10 | `GET /v1/accounts/me` | 200 | 8 | `qa-3ecb84cb-f297-4aab-959a-149e9fc089e4` |
| 11 | `GET /v1/accounts/me` | 200 | 12 | `qa-8dd15f5f-6cbf-42f6-bcbc-939c359f66b3` |
| 12 | `GET /v1/accounts/me` | 200 | 13 | `qa-4c7a9267-e154-42b6-8a64-80eccf4281bb` |
| 13 | `GET /v1/accounts/me` | 200 | 10 | `qa-aa13ebbd-91a1-4b64-8869-32f032587b6b` |
| 14 | `GET /v1/accounts/me` | 200 | 12 | `qa-125f673f-76a2-4830-85a6-d7ba471cad8c` |
| 15 | `GET /v1/accounts/me` | 200 | 14 | `qa-182f8b6c-e340-4fb5-8bc6-0d5c8d3e7f2f` |
| 16 | `GET /v1/accounts/me` | 200 | 7 | `qa-4fe55c38-214c-4b9b-8d91-06ee0dd9ed22` |
| 17 | `GET /v1/accounts/me` | 200 | 8 | `qa-88a8bff4-c3b3-47b4-935f-aeb05be20b72` |
| 18 | `GET /v1/accounts/me` | 200 | 13 | `qa-51417339-5a97-4426-8c24-6f97e76399e8` |
| 19 | `GET /v1/accounts/me` | 200 | 7 | `qa-df12c51d-53e5-4dbb-ac06-a2fea63c612f` |
| 20 | `GET /v1/accounts/me` | 200 | 9 | `qa-2337f78c-907a-4d96-8d70-030f2ca8622e` |
| 21 | `GET /v1/accounts/me` | 200 | 7 | `qa-c7e6ace2-f305-4695-b68d-bab9fb17b1de` |
| 22 | `GET /v1/accounts/me` | 200 | 12 | `qa-07135ebc-4c94-4fe0-81e7-f629555c3b95` |
| 23 | `GET /v1/accounts/me` | 200 | 14 | `qa-5afe88fa-034c-4feb-8c64-1816bf739664` |
| 24 | `GET /v1/accounts/me` | 200 | 14 | `qa-771ea960-0010-48a1-95d6-4eb035ab499a` |
| 25 | `GET /v1/accounts/me` | 200 | 10 | `qa-dab18400-0c35-4649-bfba-6f18169952e0` |
| 26 | `GET /v1/accounts/me` | 200 | 7 | `qa-11dd6808-e300-4c8e-bc2c-be09125ac4b4` |
| 27 | `GET /v1/accounts/me` | 200 | 13 | `qa-e405d725-d50e-4cc4-be86-3a9db59a50c0` |
| 28 | `GET /v1/accounts/me` | 200 | 7 | `qa-8face328-14fb-44fb-8410-b9b20ffb3ebd` |
| 29 | `GET /v1/accounts/me` | 200 | 8 | `qa-4c483905-1086-4cf3-b733-b51e07b1a3a7` |
| 30 | `GET /v1/accounts/me` | 200 | 7 | `qa-d5228194-84da-4546-a9c9-1e2e65aafc48` |
| 31 | `GET /v1/accounts/me` | 200 | 10 | `qa-3b3c929a-ebc4-464d-9d78-0d4c409cedf3` |
| 32 | `GET /v1/accounts/me` | 200 | 8 | `qa-b44fe397-4c4d-4c12-8209-57f9dd6cf316` |
| 33 | `GET /v1/accounts/me` | 200 | 9 | `qa-8143880e-0453-43c8-91c6-95986c85f417` |
| 34 | `GET /v1/accounts/me` | 200 | 8 | `qa-17ae57c2-3642-48f9-949e-db8eb7fa1ffd` |
| 35 | `GET /v1/accounts/me` | 200 | 11 | `qa-c52632c4-760d-4f8e-912b-a0180a2722e8` |
| 36 | `GET /v1/accounts/me` | 200 | 11 | `qa-d33673f7-2e36-4f79-8a47-ee5023391d1f` |
| 37 | `GET /v1/accounts/me` | 200 | 8 | `qa-15a93939-37c1-4b79-aeef-5a36a38f5117` |
| 38 | `GET /v1/accounts/me` | 200 | 8 | `qa-834c01c0-6b90-4ac9-b664-7c1207f6a501` |
| 39 | `GET /v1/accounts/me` | 200 | 8 | `qa-b3f6a5f3-6330-4725-9d88-d012cabe8ffb` |
| 40 | `GET /v1/accounts/me` | 200 | 8 | `qa-afdbd745-d6e2-4d13-b38d-63c6ed279926` |
| 41 | `GET /v1/accounts/me` | 200 | 7 | `qa-3a0b3499-0305-4422-a636-eafd1ca6011f` |
| 42 | `GET /v1/accounts/me` | 200 | 6 | `qa-643e7cb6-95ef-4742-86c3-2693cabec4a3` |
| 43 | `GET /v1/accounts/me` | 200 | 7 | `qa-5a8f0100-9ec1-4554-93f3-9b2f2f00a1d0` |
| 44 | `GET /v1/accounts/me` | 200 | 17 | `qa-6866f245-8ae7-416f-b205-d2fee717db1f` |
| 45 | `GET /v1/accounts/me` | 200 | 11 | `qa-e17b1ff7-32ed-4f42-8f12-8803b7b58159` |
| 46 | `GET /v1/accounts/me` | 200 | 8 | `qa-158adb6d-3575-4be5-bce3-f65e4b61df67` |
| 47 | `GET /v1/accounts/me` | 200 | 14 | `qa-9768558a-d666-4490-8f82-01229a065942` |
| 48 | `GET /v1/accounts/me` | 200 | 7 | `qa-87522af7-0a86-4ca9-9f9b-d4dd59adfc86` |
| 49 | `GET /v1/accounts/me` | 200 | 19 | `qa-5f963a19-bb34-436e-bc73-482830a77edd` |
| 50 | `GET /v1/accounts/me` | 200 | 11 | `qa-19f64a6f-4849-4ce1-a8c6-ed7579a0c227` |
| 51 | `GET /v1/accounts/me` | 200 | 11 | `qa-e3bef5e0-1c24-41ed-bb15-105a2cb65444` |
| 52 | `GET /v1/accounts/me` | 200 | 11 | `qa-7e3b2b91-9f7e-427a-9dd1-4b73e78c90ee` |
| 53 | `GET /v1/accounts/me` | 200 | 8 | `qa-fe8b4429-fa96-44dd-bb98-8c984465b939` |
| 54 | `GET /v1/accounts/me` | 200 | 11 | `qa-a01479e0-2b59-4a57-9c7a-7c1b21f67b0e` |
| 55 | `GET /v1/accounts/me` | 200 | 11 | `qa-8bf0b839-a049-4f00-a047-376bd3faf799` |
| 56 | `GET /v1/accounts/me` | 200 | 10 | `qa-13dfd153-bda1-4879-a0fa-743281bb22cf` |
| 57 | `GET /v1/accounts/me` | 200 | 6 | `qa-b19d5180-cd6e-4fec-a8b5-1828b5c4fb2f` |
| 58 | `GET /v1/accounts/me` | 200 | 9 | `qa-48a0ce6a-96cb-4073-8f1f-e7e289220e41` |
| 59 | `GET /v1/accounts/me` | 200 | 12 | `qa-89e4956b-12aa-4db0-8573-c8d03d55a7b3` |
| 60 | `GET /v1/accounts/me` | 200 | 9 | `qa-d7d91d62-12b4-4d29-96ad-257842814b03` |
| 61 | `GET /v1/accounts/me` | 200 | 14 | `qa-c5a43e31-c7c4-4ce6-be50-0c488215337a` |
| 62 | `GET /v1/accounts/me` | 200 | 7 | `qa-8f1c4347-0a79-4669-b2d0-830ecdf2f901` |
| 63 | `GET /v1/accounts/me` | 429 | 8 | `qa-f8d7b809-c37a-4b79-950b-853b8e17b628` |
| 64 | `GET /v1/accounts/me` | 429 | 6 | `qa-df7c3c75-188b-4967-8baf-6c66c7001b11` |
| 65 | `GET /v1/accounts/me` | 429 | 6 | `qa-0c32a478-ad95-4fd0-a485-c029b425a407` |
| 66 | `GET /v1/accounts/me` | 429 | 7 | `qa-35893d77-589b-41b3-902a-a346845f7ec0` |
| 67 | `GET /v1/accounts/me` | 429 | 6 | `qa-6bb4f545-4b0e-460f-85e4-953c39020a99` |
| 68 | `GET /v1/accounts/me` | 429 | 4 | `qa-f15ffb84-0b0a-4301-905b-c1e3ce4bb3db` |
| 69 | `GET /v1/accounts/me` | 429 | 4 | `qa-e0bcfdd2-e31c-4b56-807f-fa108eeb90c4` |
| 70 | `GET /v1/accounts/me` | 429 | 6 | `qa-1226d1ad-e9bb-4d68-9cd8-83506077254c` |
| 71 | `GET /v1/accounts/me` | 429 | 5 | `qa-de47a051-4f82-4b0d-a711-7a9ecb383cc3` |
| 72 | `GET /v1/accounts/me` | 429 | 4 | `qa-6001e217-9c67-4a3f-941a-677248bb3f86` |
| 73 | `GET /v1/accounts/me` | 429 | 6 | `qa-068436cd-739a-44dd-93c9-c82bbdf8e65e` |
| 74 | `GET /v1/accounts/me` | 429 | 4 | `qa-02c410c4-2a0a-4ba1-82c6-cc71ed3446ab` |
| 75 | `GET /v1/accounts/me` | 429 | 4 | `qa-87880429-2c36-4daf-ab53-78a4327b5c19` |
| 76 | `GET /v1/accounts/me` | 429 | 5 | `qa-b72acf30-a9a4-4227-9926-8238f05688a0` |
| 77 | `GET /v1/accounts/me` | 429 | 5 | `qa-11d45287-b4a9-4f69-901a-64619ab111c4` |
| 78 | `GET /v1/accounts/me` | 429 | 4 | `qa-eeccc07f-dc30-412c-b529-92f516436b25` |
| 79 | `GET /v1/accounts/me` | 429 | 5 | `qa-d7fee1ab-28dd-417d-a473-19d07ac620ee` |
| 80 | `GET /v1/accounts/me` | 429 | 4 | `qa-a03e86a2-3936-4e09-b607-60aa11f0bc55` |
| 81 | `GET /v1/accounts/me` | 200 | 4 | `qa-c90d7bf7-b216-4ed5-bea5-deae4d5259bb` |
| 82 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-0892e87c-92ab-4261-88d2-15cb9d2583ee` |
| 83 | `POST /v1/auth/token` | 401 | 3 | `qa-6846a02c-1091-479e-b477-c9244bf6cbb7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0d61bfcc-e2a8-4282-a93c-74aa1fdcb037

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d61bfcc-e2a8-4282-a93c-74aa1fdcb037
Content-Type: application/json

--- request body ---
{"handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","password":"****","region":"eu"}

--- response: 201 in 423 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d61bfcc-e2a8-4282-a93c-74aa1fdcb037
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 11
Location: /v1/accounts/qa-27977fdbfe4d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-bb4adfd7-e998-454f-9a43-9fdc509596fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb4adfd7-e998-454f-9a43-9fdc509596fa
Content-Type: application/json

--- request body ---
{"handle":"qa-27977fdbfe4d","password":"****"}

--- response: 200 in 55 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb4adfd7-e998-454f-9a43-9fdc509596fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-b8ad68c4-b565-4c09-8567-66952c5e336f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8ad68c4-b565-4c09-8567-66952c5e336f
Content-Type: application/json

--- response: 200 in 47 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8ad68c4-b565-4c09-8567-66952c5e336f
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
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-0690cdf8-b684-4489-bd88-a90d7d929239

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0690cdf8-b684-4489-bd88-a90d7d929239
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-0690cdf8-b684-4489-bd88-a90d7d929239
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
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-3fd10ace-7226-4165-9f50-2f1bc43bffd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fd10ace-7226-4165-9f50-2f1bc43bffd1
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fd10ace-7226-4165-9f50-2f1bc43bffd1
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
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-26d345eb-b858-405b-a128-ebbb133ecef6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26d345eb-b858-405b-a128-ebbb133ecef6
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-26d345eb-b858-405b-a128-ebbb133ecef6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-b666fcb1-543d-464b-ad6f-d18ae185c3c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b666fcb1-543d-464b-ad6f-d18ae185c3c5
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-b666fcb1-543d-464b-ad6f-d18ae185c3c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-272579f8-096d-46c3-a495-b11a3832f268

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-272579f8-096d-46c3-a495-b11a3832f268
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-272579f8-096d-46c3-a495-b11a3832f268
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-d1318514-7a70-453a-b6c4-bee435796cbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1318514-7a70-453a-b6c4-bee435796cbd
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1318514-7a70-453a-b6c4-bee435796cbd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-3ecb84cb-f297-4aab-959a-149e9fc089e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ecb84cb-f297-4aab-959a-149e9fc089e4
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ecb84cb-f297-4aab-959a-149e9fc089e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-8dd15f5f-6cbf-42f6-bcbc-939c359f66b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8dd15f5f-6cbf-42f6-bcbc-939c359f66b3
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-8dd15f5f-6cbf-42f6-bcbc-939c359f66b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-4c7a9267-e154-42b6-8a64-80eccf4281bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c7a9267-e154-42b6-8a64-80eccf4281bb
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c7a9267-e154-42b6-8a64-80eccf4281bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-aa13ebbd-91a1-4b64-8869-32f032587b6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa13ebbd-91a1-4b64-8869-32f032587b6b
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa13ebbd-91a1-4b64-8869-32f032587b6b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-125f673f-76a2-4830-85a6-d7ba471cad8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-125f673f-76a2-4830-85a6-d7ba471cad8c
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-125f673f-76a2-4830-85a6-d7ba471cad8c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-182f8b6c-e340-4fb5-8bc6-0d5c8d3e7f2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-182f8b6c-e340-4fb5-8bc6-0d5c8d3e7f2f
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-182f8b6c-e340-4fb5-8bc6-0d5c8d3e7f2f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-4fe55c38-214c-4b9b-8d91-06ee0dd9ed22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fe55c38-214c-4b9b-8d91-06ee0dd9ed22
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-4fe55c38-214c-4b9b-8d91-06ee0dd9ed22
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-88a8bff4-c3b3-47b4-935f-aeb05be20b72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88a8bff4-c3b3-47b4-935f-aeb05be20b72
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-88a8bff4-c3b3-47b4-935f-aeb05be20b72
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-51417339-5a97-4426-8c24-6f97e76399e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51417339-5a97-4426-8c24-6f97e76399e8
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-51417339-5a97-4426-8c24-6f97e76399e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-df12c51d-53e5-4dbb-ac06-a2fea63c612f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df12c51d-53e5-4dbb-ac06-a2fea63c612f
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-df12c51d-53e5-4dbb-ac06-a2fea63c612f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-2337f78c-907a-4d96-8d70-030f2ca8622e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2337f78c-907a-4d96-8d70-030f2ca8622e
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-2337f78c-907a-4d96-8d70-030f2ca8622e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-c7e6ace2-f305-4695-b68d-bab9fb17b1de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7e6ace2-f305-4695-b68d-bab9fb17b1de
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7e6ace2-f305-4695-b68d-bab9fb17b1de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-07135ebc-4c94-4fe0-81e7-f629555c3b95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07135ebc-4c94-4fe0-81e7-f629555c3b95
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-07135ebc-4c94-4fe0-81e7-f629555c3b95
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-5afe88fa-034c-4feb-8c64-1816bf739664

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5afe88fa-034c-4feb-8c64-1816bf739664
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-5afe88fa-034c-4feb-8c64-1816bf739664
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-771ea960-0010-48a1-95d6-4eb035ab499a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-771ea960-0010-48a1-95d6-4eb035ab499a
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-771ea960-0010-48a1-95d6-4eb035ab499a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-dab18400-0c35-4649-bfba-6f18169952e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dab18400-0c35-4649-bfba-6f18169952e0
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-dab18400-0c35-4649-bfba-6f18169952e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-11dd6808-e300-4c8e-bc2c-be09125ac4b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11dd6808-e300-4c8e-bc2c-be09125ac4b4
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-11dd6808-e300-4c8e-bc2c-be09125ac4b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-e405d725-d50e-4cc4-be86-3a9db59a50c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e405d725-d50e-4cc4-be86-3a9db59a50c0
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-e405d725-d50e-4cc4-be86-3a9db59a50c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-8face328-14fb-44fb-8410-b9b20ffb3ebd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8face328-14fb-44fb-8410-b9b20ffb3ebd
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-8face328-14fb-44fb-8410-b9b20ffb3ebd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-4c483905-1086-4cf3-b733-b51e07b1a3a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c483905-1086-4cf3-b733-b51e07b1a3a7
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c483905-1086-4cf3-b733-b51e07b1a3a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-d5228194-84da-4546-a9c9-1e2e65aafc48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5228194-84da-4546-a9c9-1e2e65aafc48
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5228194-84da-4546-a9c9-1e2e65aafc48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-3b3c929a-ebc4-464d-9d78-0d4c409cedf3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b3c929a-ebc4-464d-9d78-0d4c409cedf3
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b3c929a-ebc4-464d-9d78-0d4c409cedf3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-b44fe397-4c4d-4c12-8209-57f9dd6cf316

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b44fe397-4c4d-4c12-8209-57f9dd6cf316
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-b44fe397-4c4d-4c12-8209-57f9dd6cf316
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-8143880e-0453-43c8-91c6-95986c85f417

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8143880e-0453-43c8-91c6-95986c85f417
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-8143880e-0453-43c8-91c6-95986c85f417
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-17ae57c2-3642-48f9-949e-db8eb7fa1ffd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17ae57c2-3642-48f9-949e-db8eb7fa1ffd
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-17ae57c2-3642-48f9-949e-db8eb7fa1ffd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-c52632c4-760d-4f8e-912b-a0180a2722e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c52632c4-760d-4f8e-912b-a0180a2722e8
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-c52632c4-760d-4f8e-912b-a0180a2722e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-d33673f7-2e36-4f79-8a47-ee5023391d1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d33673f7-2e36-4f79-8a47-ee5023391d1f
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-d33673f7-2e36-4f79-8a47-ee5023391d1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-15a93939-37c1-4b79-aeef-5a36a38f5117

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15a93939-37c1-4b79-aeef-5a36a38f5117
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-15a93939-37c1-4b79-aeef-5a36a38f5117
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-834c01c0-6b90-4ac9-b664-7c1207f6a501

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-834c01c0-6b90-4ac9-b664-7c1207f6a501
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-834c01c0-6b90-4ac9-b664-7c1207f6a501
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-b3f6a5f3-6330-4725-9d88-d012cabe8ffb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3f6a5f3-6330-4725-9d88-d012cabe8ffb
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3f6a5f3-6330-4725-9d88-d012cabe8ffb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-afdbd745-d6e2-4d13-b38d-63c6ed279926

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afdbd745-d6e2-4d13-b38d-63c6ed279926
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-afdbd745-d6e2-4d13-b38d-63c6ed279926
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-3a0b3499-0305-4422-a636-eafd1ca6011f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a0b3499-0305-4422-a636-eafd1ca6011f
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a0b3499-0305-4422-a636-eafd1ca6011f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-643e7cb6-95ef-4742-86c3-2693cabec4a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-643e7cb6-95ef-4742-86c3-2693cabec4a3
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-643e7cb6-95ef-4742-86c3-2693cabec4a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-5a8f0100-9ec1-4554-93f3-9b2f2f00a1d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a8f0100-9ec1-4554-93f3-9b2f2f00a1d0
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a8f0100-9ec1-4554-93f3-9b2f2f00a1d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-6866f245-8ae7-416f-b205-d2fee717db1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6866f245-8ae7-416f-b205-d2fee717db1f
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-6866f245-8ae7-416f-b205-d2fee717db1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-e17b1ff7-32ed-4f42-8f12-8803b7b58159

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e17b1ff7-32ed-4f42-8f12-8803b7b58159
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-e17b1ff7-32ed-4f42-8f12-8803b7b58159
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-158adb6d-3575-4be5-bce3-f65e4b61df67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-158adb6d-3575-4be5-bce3-f65e4b61df67
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-158adb6d-3575-4be5-bce3-f65e4b61df67
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-9768558a-d666-4490-8f82-01229a065942

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9768558a-d666-4490-8f82-01229a065942
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-9768558a-d666-4490-8f82-01229a065942
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-87522af7-0a86-4ca9-9f9b-d4dd59adfc86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87522af7-0a86-4ca9-9f9b-d4dd59adfc86
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-87522af7-0a86-4ca9-9f9b-d4dd59adfc86
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-5f963a19-bb34-436e-bc73-482830a77edd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f963a19-bb34-436e-bc73-482830a77edd
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f963a19-bb34-436e-bc73-482830a77edd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-19f64a6f-4849-4ce1-a8c6-ed7579a0c227

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19f64a6f-4849-4ce1-a8c6-ed7579a0c227
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-19f64a6f-4849-4ce1-a8c6-ed7579a0c227
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-e3bef5e0-1c24-41ed-bb15-105a2cb65444

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3bef5e0-1c24-41ed-bb15-105a2cb65444
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3bef5e0-1c24-41ed-bb15-105a2cb65444
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-7e3b2b91-9f7e-427a-9dd1-4b73e78c90ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e3b2b91-9f7e-427a-9dd1-4b73e78c90ee
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e3b2b91-9f7e-427a-9dd1-4b73e78c90ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-fe8b4429-fa96-44dd-bb98-8c984465b939

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe8b4429-fa96-44dd-bb98-8c984465b939
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe8b4429-fa96-44dd-bb98-8c984465b939
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-a01479e0-2b59-4a57-9c7a-7c1b21f67b0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a01479e0-2b59-4a57-9c7a-7c1b21f67b0e
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-a01479e0-2b59-4a57-9c7a-7c1b21f67b0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-8bf0b839-a049-4f00-a047-376bd3faf799

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bf0b839-a049-4f00-a047-376bd3faf799
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-8bf0b839-a049-4f00-a047-376bd3faf799
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-13dfd153-bda1-4879-a0fa-743281bb22cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13dfd153-bda1-4879-a0fa-743281bb22cf
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-13dfd153-bda1-4879-a0fa-743281bb22cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-b19d5180-cd6e-4fec-a8b5-1828b5c4fb2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b19d5180-cd6e-4fec-a8b5-1828b5c4fb2f
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-b19d5180-cd6e-4fec-a8b5-1828b5c4fb2f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-48a0ce6a-96cb-4073-8f1f-e7e289220e41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48a0ce6a-96cb-4073-8f1f-e7e289220e41
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-48a0ce6a-96cb-4073-8f1f-e7e289220e41
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-89e4956b-12aa-4db0-8573-c8d03d55a7b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89e4956b-12aa-4db0-8573-c8d03d55a7b3
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-89e4956b-12aa-4db0-8573-c8d03d55a7b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-d7d91d62-12b4-4d29-96ad-257842814b03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7d91d62-12b4-4d29-96ad-257842814b03
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7d91d62-12b4-4d29-96ad-257842814b03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-c5a43e31-c7c4-4ce6-be50-0c488215337a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5a43e31-c7c4-4ce6-be50-0c488215337a
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5a43e31-c7c4-4ce6-be50-0c488215337a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-8f1c4347-0a79-4669-b2d0-830ecdf2f901

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f1c4347-0a79-4669-b2d0-830ecdf2f901
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f1c4347-0a79-4669-b2d0-830ecdf2f901
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-f8d7b809-c37a-4b79-950b-853b8e17b628

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8d7b809-c37a-4b79-950b-853b8e17b628
Content-Type: application/json

--- response: 429 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f8d7b809-c37a-4b79-950b-853b8e17b628
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f8d7b809-c37a-4b79-950b-853b8e17b628"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-df7c3c75-188b-4967-8baf-6c66c7001b11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df7c3c75-188b-4967-8baf-6c66c7001b11
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df7c3c75-188b-4967-8baf-6c66c7001b11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-df7c3c75-188b-4967-8baf-6c66c7001b11"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-0c32a478-ad95-4fd0-a485-c029b425a407

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c32a478-ad95-4fd0-a485-c029b425a407
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0c32a478-ad95-4fd0-a485-c029b425a407
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0c32a478-ad95-4fd0-a485-c029b425a407"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-35893d77-589b-41b3-902a-a346845f7ec0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35893d77-589b-41b3-902a-a346845f7ec0
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35893d77-589b-41b3-902a-a346845f7ec0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-35893d77-589b-41b3-902a-a346845f7ec0"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-6bb4f545-4b0e-460f-85e4-953c39020a99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bb4f545-4b0e-460f-85e4-953c39020a99
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6bb4f545-4b0e-460f-85e4-953c39020a99
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6bb4f545-4b0e-460f-85e4-953c39020a99"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-f15ffb84-0b0a-4301-905b-c1e3ce4bb3db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f15ffb84-0b0a-4301-905b-c1e3ce4bb3db
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f15ffb84-0b0a-4301-905b-c1e3ce4bb3db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f15ffb84-0b0a-4301-905b-c1e3ce4bb3db"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-e0bcfdd2-e31c-4b56-807f-fa108eeb90c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0bcfdd2-e31c-4b56-807f-fa108eeb90c4
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e0bcfdd2-e31c-4b56-807f-fa108eeb90c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e0bcfdd2-e31c-4b56-807f-fa108eeb90c4"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-1226d1ad-e9bb-4d68-9cd8-83506077254c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1226d1ad-e9bb-4d68-9cd8-83506077254c
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1226d1ad-e9bb-4d68-9cd8-83506077254c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1226d1ad-e9bb-4d68-9cd8-83506077254c"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-de47a051-4f82-4b0d-a711-7a9ecb383cc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de47a051-4f82-4b0d-a711-7a9ecb383cc3
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-de47a051-4f82-4b0d-a711-7a9ecb383cc3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-de47a051-4f82-4b0d-a711-7a9ecb383cc3"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-6001e217-9c67-4a3f-941a-677248bb3f86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6001e217-9c67-4a3f-941a-677248bb3f86
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6001e217-9c67-4a3f-941a-677248bb3f86
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6001e217-9c67-4a3f-941a-677248bb3f86"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-068436cd-739a-44dd-93c9-c82bbdf8e65e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-068436cd-739a-44dd-93c9-c82bbdf8e65e
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-068436cd-739a-44dd-93c9-c82bbdf8e65e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-068436cd-739a-44dd-93c9-c82bbdf8e65e"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-02c410c4-2a0a-4ba1-82c6-cc71ed3446ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02c410c4-2a0a-4ba1-82c6-cc71ed3446ab
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-02c410c4-2a0a-4ba1-82c6-cc71ed3446ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-02c410c4-2a0a-4ba1-82c6-cc71ed3446ab"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-87880429-2c36-4daf-ab53-78a4327b5c19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87880429-2c36-4daf-ab53-78a4327b5c19
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-87880429-2c36-4daf-ab53-78a4327b5c19
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-87880429-2c36-4daf-ab53-78a4327b5c19"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-b72acf30-a9a4-4227-9926-8238f05688a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b72acf30-a9a4-4227-9926-8238f05688a0
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b72acf30-a9a4-4227-9926-8238f05688a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b72acf30-a9a4-4227-9926-8238f05688a0"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-11d45287-b4a9-4f69-901a-64619ab111c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11d45287-b4a9-4f69-901a-64619ab111c4
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-11d45287-b4a9-4f69-901a-64619ab111c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-11d45287-b4a9-4f69-901a-64619ab111c4"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-eeccc07f-dc30-412c-b529-92f516436b25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eeccc07f-dc30-412c-b529-92f516436b25
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eeccc07f-dc30-412c-b529-92f516436b25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-eeccc07f-dc30-412c-b529-92f516436b25"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-d7fee1ab-28dd-417d-a473-19d07ac620ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7fee1ab-28dd-417d-a473-19d07ac620ee
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d7fee1ab-28dd-417d-a473-19d07ac620ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d7fee1ab-28dd-417d-a473-19d07ac620ee"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-a03e86a2-3936-4e09-b607-60aa11f0bc55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a03e86a2-3936-4e09-b607-60aa11f0bc55
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a03e86a2-3936-4e09-b607-60aa11f0bc55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a03e86a2-3936-4e09-b607-60aa11f0bc55"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-c90d7bf7-b216-4ed5-bea5-deae4d5259bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c90d7bf7-b216-4ed5-bea5-deae4d5259bb
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-c90d7bf7-b216-4ed5-bea5-deae4d5259bb
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
Content-Length: 181

{"id":"acc_a3ef10d0-cdd4-4fc0-a077-eda31a9cc8cf","handle":"qa-27977fdbfe4d","displayName":"QA 27977fdbfe4d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.186190728Z"}
```

## 82. DELETE /v1/accounts/me

```text
#82 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0892e87c-92ab-4261-88d2-15cb9d2583ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0892e87c-92ab-4261-88d2-15cb9d2583ee
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0892e87c-92ab-4261-88d2-15cb9d2583ee
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

## 83. POST /v1/auth/token

```text
#83 POST http://localhost:7070/v1/auth/token
correlation: qa-6846a02c-1091-479e-b477-c9244bf6cbb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6846a02c-1091-479e-b477-c9244bf6cbb7
Content-Type: application/json

--- request body ---
{"handle":"qa-27977fdbfe4d","password":"****"}

--- response: 401 in 3 ms ---
Date: Sat, 14 Nov 2026 09:05:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6846a02c-1091-479e-b477-c9244bf6cbb7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6846a02c-1091-479e-b477-c9244bf6cbb7"}
```
